package com.hackumass.mealy;

import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class LocationSelect extends ActionBarActivity {
	private ListView mLocationListView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_select);
        
        mLocationListView = (ListView) findViewById(R.id.locations_list_view);
        
        // Load the list of dining locations
//        ArrayList<String> locationsList = new ArrayList<String>();
        ArrayList<String> locationsList = new ArrayList<String>(Arrays.asList(
        		getResources().getStringArray(R.array.dining_locations)));
        ListAdapter locationListdapter = new ArrayAdapter<String>(this, 
        		R.layout.location_list_row, locationsList);
        
        // Display the list of dining locations
        mLocationListView.setAdapter(locationListdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.location_select, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
