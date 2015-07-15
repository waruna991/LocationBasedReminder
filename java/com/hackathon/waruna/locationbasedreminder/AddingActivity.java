package com.hackathon.waruna.locationbasedreminder;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class AddingActivity extends ActionBarActivity {

    EditText editTextTitle;
    EditText editTextNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);
        editTextTitle = (EditText) findViewById(R.id.title);
        editTextNote = (EditText) findViewById(R.id.note);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adding, menu);
        return true;
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

        return super.onOptionsItemSelected(item);
    }

    public void tagLocation(View view) {
        Reminder reminder = new Reminder(editTextTitle.getText().toString(),editTextNote.getText().toString());
        Intent intent = new Intent(AddingActivity.this, TagActivity.class);
        intent.putExtra("reminder", reminder);
        startActivity(intent);
    }
}
