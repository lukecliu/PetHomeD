package com.cl.pethomed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Liu
 */
public class HomepageFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();


    ImageFragmentPagerAdapter imageFragmentPagerAdapter;
    ViewPager viewPager;
    static final int NUM_ITEMS = 6;
    public static final String[] IMAGE_NAME = {"image0", "image1", "image2", "image3", "image4", "image5",};

    public HomepageFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_homepage, container, false);

        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.homepage_gridView );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type1,
                R.id.img_item_imageview,
                null);

        grid.setAdapter(adapter);

        imageFragmentPagerAdapter = new ImageFragmentPagerAdapter(this.getFragmentManager());
        viewPager = (ViewPager) rootView.findViewById(R.id.hompage_viewpager);
        viewPager.setAdapter(imageFragmentPagerAdapter);
        return rootView;
    }

    private void setData() {

        for (int i = 0; i < 11; i++) {

            final ImageDescModel sched = new ImageDescModel();

            ///
            sched.setImageName("image" + i);

            ///
            model_list.add( sched );
        }

    }


    public static class ImageFragmentPagerAdapter extends FragmentPagerAdapter {

        public ImageFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            SwipeFragment fragment = new SwipeFragment();
            return SwipeFragment.newInstance(position);
        }


    }


    public static class SwipeFragment extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootview = inflater.inflate(R.layout.viewpager_item_type1, container, false);

            ImageView imageView = (ImageView) rootview.findViewById(R.id.item_imageview);
            Bundle bundle = getArguments();
            int position = bundle.getInt("position");
            String imageFileName = IMAGE_NAME[position];
            int imgResId = getResources().getIdentifier(imageFileName, "drawable", "com.cl.pethomed");
            imageView.setImageResource(imgResId);
            return rootview;
        }

        static SwipeFragment newInstance(int position) {
            SwipeFragment swipeFragment = new SwipeFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            swipeFragment.setArguments(bundle);
            return swipeFragment;
        }
    }

}
