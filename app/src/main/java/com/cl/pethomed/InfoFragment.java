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
public class InfoFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

    public InfoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_info, container, false);

        //// setup GridView adapter & it's model
        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.info_gridview );

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
        sched.addDescription("卡伯聖盧卡斯（Cabos San Lucas）是墨西哥的渡假勝地，" +
                "來自雪梨的Jarrod Heydon McIntosh和他的朋友到當地旅遊，乘船出海釣魚時遇到" +
                "一隻海獅，一群人以「鮮魚」作誘餌，跟他玩起自拍");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image1");
        sched.addDescription("男性雜誌編輯凱勒（Jared Keller）在推特上發問，「狗狗穿褲子，" +
                "應該穿2條腿還是4條腿呢？」並附上示意圖片，引來3萬多名網友熱烈討論，" +
                "有網友認為只要穿2條腿，有人卻認為應該全部穿上，還有許多人上傳自家狗狗的" +
                "示範圖片，意外掀起一番口水戰");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image2");
        sched.addDescription("網友在捷運動物園站外面看到穿山甲，不曉得是不是動物園跑出來的。" +
                "不少網友看到後認為牠的性命恐怕不保，可能會被人抓去吃掉，紛紛擔心地表示，" +
                "「在動物園不會被吃，外面就難說。」");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image3");
        sched.addDescription("愛爾蘭威克洛小鎮（Wicklow Town）有一隻明星海狗山米（Sammy）" +
                "常常都會跑到岸上討食，已經成為當地大家都認識的小惡霸，前陣子他竟然尾隨魚市場" +
                "的工作人員穿越馬路，試圖想要進去「打劫」一番。雖然走到半路就被阻止，" +
                "但牠最後還是得到了一點點新鮮的魚當點心，也算是願望達成了。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image4");
        sched.addDescription("位於新加坡心臟地帶的五星酒店Wagington最近推出奢華套房，" +
                "主要針對毛孩設計，裡面還播放古典音樂讓寵物放鬆。雖然大部分的毛客人在室內休息，" +
                "不過倒是有一個骨型的游泳池讓狗嬉戲。自2014年開業之後好評不斷，因此擴大項目。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image5");
        sched.addDescription("我們可能沒有能力將收容所的狗狗全部帶出來，但美國密蘇里州（Missouri）" +
                "的這些小朋友卻做了一件很棒的事情，他們坐在每一隻特別害羞的狗狗面前，一字一句" +
                "並帶感情的講故事給牠們聽，讓這些原本害怕又不敢親近人的狗可以慢慢學會與人接觸，" +
                "除了可以訓練小朋友的語言能力，更提高了這些狗狗的認養率。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image6");
        sched.addDescription("有這樣的健身伙伴實在是太幸福了！讓狗狗走跑步機運動減肥其實不是" +
                "什麼很稀奇的事，但國外這隻悠閒的狗爸爸卻有全市界最可愛的運動小幫手，" +
                "就是牠的小孩！這隻小狗乖乖地沒有亂跳上運轉中的跑步機，反而站在一旁用牠的" +
                "小手幫爸爸撥動跑步帶，可愛又乖巧的模樣讓影片在網路上迅速爆紅。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image7");
        sched.addDescription("你有想過毛小孩在你生命中扮演著什麼角色嗎？美國攝影師克里斯托弗" +
                "(Christopher Cline)在2014年時與1歲7個月大的「Juji」相遇，而他把和Juji相處" +
                "的「錯覺照片」放到網路上後，不僅可看到這隻毛小孩在他心中所佔據的大份量，" +
                "更在一夕之間成為許多網友關注的對象。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image8");
        sched.addDescription("泰國屬於熱帶氣候的國家，一但熱起來連動物都受不了，" +
                "只能用各種「奇葩」的方式讓自己舒服一點。有隻狗狗因為太熱了，" +
                "竟然直接躺在超商門口睡了起來，還非常聰明地用頭擋在自動門的位置，" +
                "只要門一關起來撞到牠的頭就又會彈開，就這樣安心地沉沉睡去，讓經過的路人都笑到不行。");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image9");
        sched.addDescription("樹上怎麼長貓了？最近網路上流傳一張照片，只見光禿禿的枝頭上棲息了" +
                "好多隻「松鼠」，但怎麼體型好像有點過於龐大？仔細一看才發現竟然有多達12隻的" +
                "胖貓咪安穩地坐在樹上，不過牠們胖嘟嘟的身驅對比細到快斷掉的樹枝也讓網友捏" +
                "把冷汗，直說真的很怕會發生意外啊！");
        model_list.add(sched);

        sched = new ImageDescModel();
        sched.setImageName("image10");
        sched.addDescription("抒情王子光良2002收養了一隻小狗取名「小High」，" +
                "至今已經生活了13年，愛犬在2015年3月因脊椎手術導致下半身癱瘓，" +
                "他親自24小時看護，還花了120萬幫愛狗針灸，中西療法並用。小High最近過生日，" +
                "光良在身後支撐著狗狗向前，感人的一幕讓網友直呼太催淚。");
        model_list.add(sched);


    }

}