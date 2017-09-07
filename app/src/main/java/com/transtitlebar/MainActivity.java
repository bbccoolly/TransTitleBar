package com.transtitlebar;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;
import com.transtitlebar.adapter.FragmentViewPagerAdapter;
import com.transtitlebar.fragment.BaseFragment;
import com.transtitlebar.fragment.Fragment_1;
import com.transtitlebar.fragment.Fragment_2;
import com.transtitlebar.fragment.Fragment_3;
import com.transtitlebar.fragment.Fragment_4;
import com.transtitlebar.fragment.Fragment_5;
import com.transtitlebar.util.TabViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottomBar)
    BottomBar mBottomBar;
    @BindView(R.id.vp)
    ViewPager mVp;

    private FragmentPagerAdapter mAdapter;
    private List<BaseFragment> mFragments = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mFragments.add(new Fragment_1());
        mFragments.add(new Fragment_2());
        mFragments.add(new Fragment_3());
        mFragments.add(new Fragment_4());
        mFragments.add(new Fragment_5());

        mAdapter = new FragmentViewPagerAdapter(getSupportFragmentManager(), mFragments);
        mVp.setAdapter(mAdapter);
        mBottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                mVp.setCurrentItem(TabViewPager.get(tabId));

            }
        });
        mBottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
            }
        });


        mVp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mBottomBar.setDefaultTabPosition(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}
