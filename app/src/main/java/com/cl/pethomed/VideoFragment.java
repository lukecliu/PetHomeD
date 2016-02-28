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
public class VideoFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

    public VideoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_video, container, false);

        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.video_gridview );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type4,
                R.id.img_desc_item_imageview,
                new int[]{
                        R.id.img_desc_item_textView
                }
        );

        grid.setAdapter(adapter);

        return rootView;
    }


    private void setData() {

        ImageDescModel sched;

        sched = new ImageDescModel();
        sched.setImageName("image0");
        sched.addDescription("乘船出海釣魚時遇到一隻海獅，一群人以「鮮魚」作誘餌，跟他玩起自拍");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image1");
        sched.addDescription("「狗狗穿褲子，應該穿2條腿還是4條腿呢？」");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image2");
        sched.addDescription("網友在捷運動物園站外面看到穿山甲");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image3");
        sched.addDescription("海狗山米（Sammy）常常都會跑到岸上討食");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image4");
        sched.addDescription("位於新加坡心臟地帶的五星酒店Wagington最近推出奢華套房，主要針對毛孩設計");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image5");
        sched.addDescription("原本害怕又不敢親近人的狗可以慢慢學會與人接觸");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image6");
        sched.addDescription("這隻小狗乖乖地沒有亂跳上運轉中的跑步機");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image7");
        sched.addDescription("在2014年時與1歲7個月大的「Juji」相遇，而他把和Juji相處的「錯覺照片」放到網路上");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image8");
        sched.addDescription("有隻狗狗因為太熱了，竟然直接躺在超商門口睡了起來");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image9");
        sched.addDescription("仔細一看才發現竟然有多達12隻的胖貓咪安穩地坐在樹上");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image10");
        sched.addDescription("抒情王子光良2002收養了一隻小狗取名「小High」");
        model_list.add(sched);


    }
}