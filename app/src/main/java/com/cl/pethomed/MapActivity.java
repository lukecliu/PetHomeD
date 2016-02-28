package com.cl.pethomed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by Liu
 */
public class MapActivity extends AppCompatActivity
    implements OnMapReadyCallback{

    LatLng[] latlng_points;
    String[] title_points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment map_fragment =
                (SupportMapFragment) this.getSupportFragmentManager().findFragmentById(R.id.map_fragment);

        map_fragment.getMapAsync(this);

        setData();

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        if(latlng_points == null) return;

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latlng_points[0], 15));

        for(int i = 0; i < latlng_points.length; i++){
            googleMap.addMarker(
                    new MarkerOptions()
                            .position(latlng_points[i])
                            .title(title_points[i]));
        }

    }

    private void setData() {
        if(latlng_points == null) {
            latlng_points = new LatLng[]{
                    new LatLng(25.068504, 121.512960),     //                "奧斯卡寵物連鎖量販"
                    new LatLng(25.025558, 121.511052),     //                "狗媽媽寵物店"
                    new LatLng(25.034135, 121.493291),     //                "愛貓園寵物店 萬華店"
                    new LatLng(25.030611, 121.528635),     //                "飛比樂 ForPET 寵物食品.用品"
                    new LatLng(25.079058, 121.546232),     //                "好來屋寵物百貨"
                    new LatLng(25.031291, 121.529500),     //                "HAPET 好寵(永康店)"
                    new LatLng(25.056743, 121.561954),     //                "小春日和 動物雜貨.咖啡"
                    new LatLng(25.015592, 121.531810),     //                "寶羅寵物水族用品店(公館店)"
                    new LatLng(25.068003, 121.523440),     //                "D&Y 寵物美容時尚旅店"
            };
        }

        if(latlng_points != null){
            title_points = new String[]{
                    "奧斯卡寵物連鎖量販",
                    "狗媽媽寵物店",
                    "愛貓園寵物店 萬華店",
                    "飛比樂 ForPET 寵物食品.用品",
                    "好來屋寵物百貨",
                    "HAPET 好寵(永康店)",
                    "小春日和 動物雜貨.咖啡",
                    "寶羅寵物水族用品店(公館店)",
                    "D&Y 寵物美容時尚旅店",
            };
        }
    }
}