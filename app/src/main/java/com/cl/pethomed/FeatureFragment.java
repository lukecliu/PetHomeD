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
public class FeatureFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

    public FeatureFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_feature, container, false);

        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.feature_gridview );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type2,
                R.id.img_desc_item_imageview,
                new int[]{R.id.img_desc_item_textView1, R.id.img_desc_item_textView2 });

        grid.setAdapter( adapter );

        return rootView;
    }


    private void setData() {

        ImageDescModel sched;

        sched = new ImageDescModel();
        sched.setImageName("image0");
        sched.addDescription("【PiPe牌煙斗牌】寵物電剪ER168H(加送三項剃毛工具組)");
        sched.addDescription("特價：1,280元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image1");
        sched.addDescription("【HEPPER】獨享空間貝殼貓窩(黑白斜紋)");
        sched.addDescription("特價：4,680元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image2");
        sched.addDescription("【汪汪寶貝】愛護貓咪潔耳液+貓用除臭濕巾組(抗菌)");
        sched.addDescription("特價：580元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image3");
        sched.addDescription("【星記StarMark】磨牙球 中號(不含磨牙餅)");
        sched.addDescription("特價：590元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image4");
        sched.addDescription("【JET-WELL】日系甜美厚毛呢抓皺斗篷狗衣(藍)");
        sched.addDescription("特價：980元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image5");
        sched.addDescription("【日本Marukan】小動物專用-保溫電球組20W(HD-20C)");
        sched.addDescription("特價：890元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image6");
        sched.addDescription("【Petstages】384魔力藍薯鼠");
        sched.addDescription("特價：250元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image7");
        sched.addDescription("【美國Petmate】Vari Kennel 豪華運輸籠(32P 適用5-7公斤)");
        sched.addDescription("特價：1,600元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image8");
        sched.addDescription("【美國afp貓咪貓草玩具】貓茶包(鮮橙橘)");
        sched.addDescription("特價：250元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image9");
        sched.addDescription("【IBIYAYA依比呀呀】二代冠軍子彈推車-米狗餅乾(FS701)");
        sched.addDescription("特價：3,825元");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image10");
        sched.addDescription("【PPARK寵物公園】寵物拉桿包(紅/藍)");
        sched.addDescription("特價：4,390元");
        model_list.add(sched);


    }
}