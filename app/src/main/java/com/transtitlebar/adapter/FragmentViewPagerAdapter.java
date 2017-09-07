package com.transtitlebar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.transtitlebar.fragment.BaseFragment;

import java.util.List;

/**
 * created by bcoly on 2017/9/7.
 */

public class FragmentViewPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mFragments;
    private BaseFragment currentFragment;

    public FragmentViewPagerAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        mFragments = fragments;
        currentFragment = fragments.get(0);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public BaseFragment getCurrentFragment() {
        return currentFragment;
    }
}
