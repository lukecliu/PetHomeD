package com.cl.pethomed;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Liu on 2016/02/06.
 */
public class ImageDescAdapter extends BaseAdapter
    implements OnClickListener {

    private Activity activity;
    private ArrayList data;
    ImageDescModel tempItem=null;

    private static LayoutInflater inflater=null;
    public Resources res;
    int i=0;

    public ImageDescAdapter(Activity activity, ArrayList data, Resources res) {
        this.activity = activity;
        this.data = data;
        this.res = res;

        inflater = ( LayoutInflater )activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

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

            vi = inflater.inflate(R.layout.img_desc_item, null);

            holder = new ViewHolder();
            holder.image=(ImageView)vi.findViewById(R.id.img_desc_item_imageview);
            holder.text1 = (TextView) vi.findViewById(R.id.img_desc_item_textView1);
            holder.text2=(TextView)vi.findViewById(R.id.img_desc_item_textView2);

            vi.setTag( holder );
        }
        else
            holder=(ViewHolder)vi.getTag();

        if(data.size()<=0)
        {
            holder.text1.setText("No Data");

        }
        else
        {
            tempItem=null;
            tempItem = ( ImageDescModel ) data.get( position );


            holder.text1.setText( tempItem.getDescription1() );
            holder.text2.setText( tempItem.getDescription2() );
            holder.image.setImageResource(
                    res.getIdentifier(  //TODO: exception handling on name not-found
                            "com.cl.pethomed:drawable/"+tempItem.getImageName()
                            ,null,null));


            vi.setOnClickListener(new OnItemClickListener( position ));
        }
        return vi;

        //return convertView;
    }

    private class OnItemClickListener implements OnClickListener{
        private int mPosition;

        OnItemClickListener(int position){
            mPosition = position;
        }

        @Override
        public void onClick(View arg0) {

            MainActivity target_jump_call = (MainActivity)activity;
            target_jump_call.onItemClick(mPosition);
        }
    }


    @Override
    public void onClick(View v) {
        Log.v("ImageDescAdapter","Model Clicked");
    }

    public static class ViewHolder{

        public ImageView image;
        public TextView text1;
        public TextView text2;
    }

}
