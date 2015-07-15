package com.hackathon.waruna.locationbasedreminder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;



public class MainActivity extends ActionBarActivity {

    ListView listView;
    RemindersAdapter remindersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        DataAccess dataAccess = new DataAccess();
        ListAdapter remindersAdapter = new RemindersAdapter(this,dataAccess.getAllReminders());
        listView.setAdapter(remindersAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);//edited
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_add){
            Intent intent = new Intent("com.hackathon.waruna.locationbasedreminder.AddingActivity");
            Intent myIntent = new Intent(MainActivity.this, AddingActivity.class);
            //myIntent.putExtra("key", value); //Optional parameters
            MainActivity.this.startActivity(myIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
