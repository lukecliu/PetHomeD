package com.cl.pethomed;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liu on 2016/02/06.
 */
public class ImageDescAdapter extends BaseAdapter {
//    implements OnClickListener {

    private Activity activity;
    private ArrayList data;
    ImageDescModel tempItem=null;
    int item_layout_id;
    int imageview_id;
    List<Integer> textview_id_list = new ArrayList<>();

    private static LayoutInflater inflater=null;
    public Resources res;


    public ImageDescAdapter(Activity activity, ArrayList data, Resources res,
                            int item_layout_id, int imageview_id, int[] textview_id_list) {
        this.activity = activity;
        this.data = data;
        this.res = res;
        this.item_layout_id = item_layout_id;
        this.imageview_id = imageview_id;

        if (textview_id_list != null){
            for (int id : textview_id_list) {
                this.textview_id_list.add(id);
            }
        }

        inflater = ( LayoutInflater )activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public void addPair(String data, int textview_id){
        this.data.add(data);
        this.textview_id_list.add(textview_id);
    }

    @Override
    public int getCount() {
        if(data.size()<0)
            return 0;
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        //TODO: get return item ImageDescModel
        return position; //dummy
    }

    @Override
    public long getItemId(int position) {
        //TODO: get return item id from ImageDescModel
        return position; //dummy
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder holder;

        if(vi==null){

            vi = inflater.inflate(item_layout_id, null);

            holder = new ViewHolder();
            holder.imageview=(ImageView)vi.findViewById(imageview_id);
            for(int i = 0; i < textview_id_list.size(); i++){
                if(i >= holder.textview_list.size()){
                    holder.textview_list.add(
                            (TextView) vi.findViewById(textview_id_list.get(i))
                            );
                }else{
                    holder.textview_list.set(
                            i,
                            (TextView) vi.findViewById(textview_id_list.get(i))
                    );
                }
            }

            vi.setTag( holder );
        }
        else
            holder=(ViewHolder)vi.getTag();

        if(data.size()<=0)
        {
//            holder.text1.setText("No Data");

        }
        else
        {
            tempItem=null;
            tempItem = ( ImageDescModel ) data.get( position );


            for(int i = 0; i < textview_id_list.size(); i++){
                if(i >= holder.textview_list.size()){
                    holder.textview_list.add(
                            (TextView) vi.findViewById(textview_id_list.get(i))
                    );
                }else{
                    holder.textview_list.set(
                            i,
                            (TextView) vi.findViewById(textview_id_list.get(i))
                    );
                }
            }

            for(int i = 0; i < holder.textview_list.size(); i++){
                holder.textview_list.get(i).setText(tempItem.getDescription(i));
            }
            holder.imageview.setImageResource(
                    res.getIdentifier(  //TODO: exception handling on name not-found
                            "com.cl.pethomed:drawable/" + tempItem.getImageName()
                            , null, null));


//            vi.setOnClickListener(new OnItemClickListener( position ));
        }
        return vi;

    }

//    private class OnItemClickListener implements OnClickListener{
//        private int mPosition;
//
//        OnItemClickListener(int position){
//            mPosition = position;
//        }
//
//        @Override
//        public void onClick(View arg0) {
//
//            AdoptionFragment target_jump_call = (AdoptionFragment)
//                    (((AppCompatActivity)activity).getSupportFragmentManager().findFragmentById(R.id.adoption_content_frame));
//            target_jump_call.onItemClick(mPosition);
//        }
//    }
//
//
//    @Override
//    public void onClick(View v) {
//        Log.v("ImageDescAdapter","Model Clicked");
//    }

    private class ViewHolder{

        public ImageView imageview;
        public List<TextView> textview_list = new ArrayList<>();

    }

}
