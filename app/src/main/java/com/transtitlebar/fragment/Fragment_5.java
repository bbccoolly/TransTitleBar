package com.transtitlebar.fragment;

import android.support.v7.widget.Toolbar;

import com.transtitlebar.R;
import com.transtitlebar.util.StatusBarUtil;
import com.transtitlebar.util.UIUtil;

import butterknife.BindView;

/**
 * created by bcoly on 2017/9/7.
 */

public class Fragment_5 extends BaseFragment {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected int initViewId() {
        return R.layout.fragment_5;
    }

    @Override
    protected void initTitleBar() {
        setTitle("Food");
        mToolbar.setBackgroundColor(UIUtil.getColor(R.color.flash_red));
        initStatusBarTranslate();
    }

    @Override
    protected void process() {

    }

    private void initStatusBarTranslate() {
        /**状态栏透明和间距处理*/
        StatusBarUtil.immersive(getActivity());
        StatusBarUtil.setPaddingSmart(getActivity(), mToolbar);
    }
}
