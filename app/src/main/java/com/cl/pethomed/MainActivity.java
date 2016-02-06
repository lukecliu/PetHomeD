package com.cl.pethomed;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
 //      implements NavigationView.OnNavigationItemSelectedListener {

    ImageDescAdapter adapter;
    public ArrayList<ImageDescModel> model_list = new ArrayList<ImageDescModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.img_desc_layout);

/*
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

/*
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
*/



        //// setup GridView adapter & it's model
        setData();
;
        GridView grid= (GridView)findViewById( R.id.gridview_imgdesc );  // List defined in XML ( See Below )

        adapter=new ImageDescAdapter( this, model_list, getResources() );
        grid.setAdapter( adapter );

    }

    private void setData() {

        for (int i = 0; i < 11; i++) {

            final ImageDescModel sched = new ImageDescModel();

            /******* Firstly take data in model object ******/
            sched.setImageName("image"+i);
            sched.setDescription1("Cap"+i);
            sched.setDescription2("觀看人數: " + i);

            /******** Take Model Object in ArrayList **********/
            model_list.add( sched );
        }

    }



    /*
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    */


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */

        return super.onOptionsItemSelected(item);
    }

/*
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        //Handle menu item action
        if (id == R.id.nav_item1) {

        } else if (id == R.id.nav_item2) {

        } else if (id == R.id.nav_item3) {

        } else if (id == R.id.nav_item4) {

        } else if (id == R.id.nav_item5) {

        } else if (id == R.id.nav_item6) {

        } else if (id == R.id.nav_item7) {

        } else if (id == R.id.nav_item8) {

        } else if (id == R.id.nav_item9) {

        } else if (id == R.id.nav_item10) {

        } else if (id == R.id.nav_item11) {

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
*/

    public void onItemClick(int mPosition)
    {
        ImageDescModel tempItem = ( ImageDescModel ) model_list.get(mPosition);

        //TODO: Replace with your own action, now just a stub
        Toast.makeText(this,
                "Image:" + tempItem.getImageName() + "\n" +
                        "Description1: " + tempItem.getDescription1() + "\n" +
                        "Description2: " + tempItem.getDescription2(),
                Toast.LENGTH_SHORT)
        .show();
    }

}
