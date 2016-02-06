package com.cl.pethomed;

/**
 * Created by Liu on 2016/02/06.
 */
public class ImageDescModel {

    private  String image_name="";
    private  String desc1="";
    private  String desc2="";

    public ImageDescModel(){}
    public ImageDescModel(String name, String description1, String description2){
        this.image_name = name;
        this.desc1 = description1;
        this.desc2 = description2;
    }


    public String getImageName() {
        return image_name;
    }

    public void setImageName(String image_name) {
        this.image_name = image_name;
    }

    public String getDescription1() {
        return desc1;
    }

    public void setDescription1(String desc1) {
        this.desc1 = desc1;
    }

    public String getDescription2() {
        return desc2;
    }

    public void setDescription2(String desc2) {
        this.desc2 = desc2;
    }
}
