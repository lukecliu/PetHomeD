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
    ArrayList<ImageDescModel> model_list = new ArrayList<>();

    ImageSliderAdapter imageFragmentPagerAdapter;
    ViewPager viewPager;
    ArrayList<String> image_slider_list = new ArrayList<>();

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

        //// setup gridview adapter
        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.homepage_gridView );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type1,
                R.id.img_item_imageview,
                null);

        grid.setAdapter(adapter);

        //// setup viewpager adapter
        imageFragmentPagerAdapter = new ImageSliderAdapter(this.getFragmentManager(), image_slider_list.toArray(new String[0]));
        viewPager = (ViewPager) rootView.findViewById(R.id.hompage_viewpager);
        viewPager.setAdapter(imageFragmentPagerAdapter);
        return rootView;
    }

    private void setData() {

        for (int i = 0; i < 11; i++) {
            final ImageDescModel sched = new ImageDescModel();
            sched.setImageName("image" + i);
            model_list.add( sched );
        }

        for (int i = 0; i < 5; i++) {
            image_slider_list.add("image" + i);
        }

    }

}
