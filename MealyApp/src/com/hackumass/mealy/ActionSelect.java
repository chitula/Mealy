package com.hackumass.mealy;

import java.util.ArrayList;
import java.util.Arrays;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class ActionSelect extends ActionBarActivity implements OnItemClickListener {
	
	private ListView mActionListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_action_select);

		mActionListView = (ListView) findViewById(R.id.possible_actions_list_view);
      
      // Load the list of dining locations
      ArrayList<String> possibleActionsList = new ArrayList<String>(Arrays.asList(
      		getResources().getStringArray(R.array.possible_actions)));
      ListAdapter possibleActionsListdapter = new ArrayAdapter<String>(this, 
      		R.layout.possible_action_list_row, possibleActionsList);
      
      mActionListView.setOnItemClickListener((OnItemClickListener) this);
      
      // Display the list of dining locations
      mActionListView.setAdapter(possibleActionsListdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.action_select, menu);
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

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
        switch (view.getId()) {
	        case R.id.option_view_menu:
	            // your first action code
	        case R.id.option_buy_swipe:
	            // your second action code
	        case R.id.option_sell_swipe:
	        	
	        default:
	            return super.onContextItemSelected(item);
        }
		Log.d("ActionSelect: ", "" + position);
	}

}
