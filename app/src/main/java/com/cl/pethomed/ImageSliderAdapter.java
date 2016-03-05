package com.cl.pethomed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ImageSliderAdapter extends FragmentPagerAdapter {

    String[] image_slider_array;
    ArrayList<SwipeFragment> fragment_list = new ArrayList<>();

    public ImageSliderAdapter(FragmentManager fm, String[] items) {
        super(fm);
        image_slider_array = items;

        for(int i = 0; i < items.length; i++) {
            SwipeFragment swipeFragment = new SwipeFragment();
            Bundle bundle = new Bundle();
            bundle.putString("imagename", items[i]);
            swipeFragment.setArguments(bundle);
            fragment_list.add(swipeFragment);
        }
    }

    @Override
    public int getCount() {
        return image_slider_array.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragment_list.get(position);
    }


}
