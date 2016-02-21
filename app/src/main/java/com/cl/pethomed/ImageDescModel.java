package com.cl.pethomed;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Liu on 2016/02/06.
 */
public class ImageDescModel {

    private String image_name="";
    private List<String> desc_list = new ArrayList<>();

    public ImageDescModel(){}
    public ImageDescModel(String img_name, String[] descs){
        this.image_name = img_name;
        Collections.addAll(this.desc_list,descs);
    }

    public String getImageName() {
        return this.image_name;
    }

    public void setImageName(String image_name) {
        this.image_name = image_name;
    }

    public String getDescription(int index) {
        if(index < 0 || index >= this.desc_list.size()){ return "";}
        return this.desc_list.get(index);
    }

    public int getDescSize(){
        return this.desc_list.size();
    }

    public void addDescription(String desc) {
        this.desc_list.add(desc);
    }


}
