package com.transtitlebar.util;

import com.transtitlebar.R;

/**
 * Created by iiro on 7.6.2016.
 */
public class TabViewPager {
    public static int get(int menuItemId) {
        int index = 0;

        switch (menuItemId) {
            case R.id.tab_recents:
                index = 0;
                break;
            case R.id.tab_favorites:
                index = 1;


                break;
            case R.id.tab_nearby:
                index = 2;


                break;
            case R.id.tab_friends:
                index = 3;


                break;
            case R.id.tab_food:
                index = 4;

                break;
        }
        return index;
    }
}
