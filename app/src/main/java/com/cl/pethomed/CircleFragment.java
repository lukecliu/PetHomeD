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
public class CircleFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

    public CircleFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_circle, container, false);

        //// setup GridView adapter & it's model
        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.circle_gridview );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type3,
                R.id.pic_imageView,
                new int[]{
                        R.id.avatar_textview,
                        R.id.pic_id_textview,
                        R.id.comment_textview});

        grid.setAdapter(adapter);
        return rootView;
    }

    private void setData() {

        ImageDescModel sched;

        sched = new ImageDescModel();
        sched.setImageName("image0");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 0);
        sched.addDescription("公寓後門");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image1");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 1);
        sched.addDescription("公寓後門門口");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image2");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 2);
        sched.addDescription("公寓停車場");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image3");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 3);
        sched.addDescription("公寓後院");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image4");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 4);
        sched.addDescription("我家附近森林");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image5");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 5);
        sched.addDescription("公寓後院走道");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image6");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 6);
        sched.addDescription("森林走道");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image7");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 7);
        sched.addDescription("冬天堆起來的雪");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image8");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 8);
        sched.addDescription("community center :3");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image9");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 000" + 9);
        sched.addDescription("UWaterloo 圖書館");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image10");
        sched.addDescription("Luke");
        sched.addDescription("照片編號: 00" + 10);
        sched.addDescription("學校正在建的 Engineering Building");
        model_list.add(sched);


    }


}