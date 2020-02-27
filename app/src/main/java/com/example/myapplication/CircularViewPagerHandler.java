package com.example.myapplication;


import android.widget.Adapter;
import androidx.fragment.app.FragmentManager;

import androidx.viewpager.widget.ViewPager;

public class CircularViewPagerHandler implements ViewPager.OnPageChangeListener {
    private ViewPager   mViewPager;
    private int         mCurrentPosition;
    private int         mScrollState;



    public CircularViewPagerHandler(final ViewPager viewPager) {
        mViewPager = viewPager;
    }

    @Override
    public void onPageSelected(final int position) {
        Cir(position);
        mCurrentPosition = position;
    }

    @Override
    public void onPageScrollStateChanged(final int state) {
        mScrollState = state;
    }

    private void Cir(int position){
        if(mScrollState==mViewPager.SCROLL_STATE_SETTLING){
            if(position==0) mViewPager.setCurrentItem(3,false);
            if(position==4) mViewPager.setCurrentItem(1,false);
        }
    }

    @Override
    public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {
    }
}