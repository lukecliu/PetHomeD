package com.cl.pethomed;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu
 */
public class ShopFragment extends Fragment {

    ArrayAdapter<String> shoplist_adapter;
    List<String> model_list = new ArrayList<>();;

    public ShopFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_shop, container, false);

        setData();
        shoplist_adapter = new ArrayAdapter<String>(
                this.getActivity(),
                R.layout.list_shop_item,
                R.id.address_textview,
                model_list
        );

        ListView lv = (ListView) rootView.findViewById(R.id.fragment_shop_listview);
        lv.setAdapter(shoplist_adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(view.getContext(), MapActivity.class));
            }
        });

        return rootView;
    }


    private void setData() {

        model_list.add("奧斯卡寵物連鎖量販");
        model_list.add("狗媽媽寵物店");
        model_list.add("愛貓園寵物店 萬華店");
        model_list.add("飛比樂 ForPET 寵物食品.用品");
        model_list.add("好來屋寵物百貨");
        model_list.add("HAPET 好寵(永康店)");
        model_list.add("小春日和 動物雜貨.咖啡");
        model_list.add("寶羅寵物水族用品店(公館店)");
        model_list.add("D&Y 寵物美容時尚旅店");

    }
}