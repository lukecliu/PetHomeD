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
public class AdoptionFragment extends Fragment {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<>();

    public AdoptionFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Add this line in order for this fragment to handle menu events.
        //setHasOptionsMenu(true);
    }

    /*
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_refresh) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.img_desc_layout, container, false);

        //// setup GridView adapter & it's model
        setData();
        GridView grid= (GridView)rootView.findViewById( R.id.gridview_imgdesc );

        adapter=new ImageDescAdapter( this.getActivity(), model_list, getResources(),
                R.layout.img_desc_item_type2,
                R.id.img_desc_item_imageview,
                new int[]{R.id.img_desc_item_textView1, R.id.img_desc_item_textView2 });

        grid.setAdapter( adapter );

        return rootView;
    }


    @Override
    public void onStart() {
        super.onStart();

    }
//
//    public void onItemClick(int mPosition)
//    {
//        ImageDescModel tempItem = ( ImageDescModel ) model_list.get(mPosition);
//
//        //TODO: Replace with your own action, now just a stub
//        Toast.makeText(this.getActivity(),
//                "Image:" + tempItem.getImageName() + "\n" +
//                        "Description1: " + tempItem.getDescription1() + "\n" +
//                        "Description2: " + tempItem.getDescription2(),
//                Toast.LENGTH_SHORT)
//                .show();
//    }

    private void setData() {

        for (int i = 0; i < 11; i++) {

            final ImageDescModel sched = new ImageDescModel();

            ///
            sched.setImageName("image"+i);
            sched.addDescription("Cap" + i);
            sched.addDescription("觀看人數: " + i);

            ///
            model_list.add( sched );
        }

    }
}
