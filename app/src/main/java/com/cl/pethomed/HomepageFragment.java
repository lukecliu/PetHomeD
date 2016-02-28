package com.cl.pethomed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by Liu
 */
public class HomepageFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

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


}
