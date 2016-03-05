package com.cl.pethomed;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Liu
 */
public class SwipeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.viewpager_item_type1, container, false);

        ImageView imageView = (ImageView) rootview.findViewById(R.id.item_imageview);
        Bundle bundle = getArguments();
        String imageFileName = bundle.getString("imagename");
        int imgResId = getResources().getIdentifier(imageFileName, "drawable", "com.cl.pethomed");
        imageView.setImageResource(imgResId);
        return rootview;
    }

}
