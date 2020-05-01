package com.example.tab_demo2;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SectionsPage extends FragmentPagerAdapter {
    private final Context mContext;
    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};

    public SectionsPage(@NonNull FragmentManager fm, int behavior, Context mContext) {
        super(fm, behavior);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {


            case 0 : return FirstFragment.newInstance("https://www.swiggy.com"," " );
            case 1 : return FirstFragment.newInstance("https://www.zomato.com"," ");
            case 2 : return FirstFragment.newInstance("https://www.ubereats.com"," ");
            default:  return null;
        }

    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
