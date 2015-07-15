package com.hackathon.waruna.locationbasedreminder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by waruna on 7/11/2015.
 */
public class RemindersAdapter extends ArrayAdapter<Reminder> {

    LayoutInflater layoutInflater;

    public RemindersAdapter(Context context,List<Reminder> objects) {
        super(context, R.layout.reminder_item, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.reminder_item,parent,false);
        }
        TextView textViewTitle = (TextView) convertView.findViewById(R.id.textViewTitle);
        TextView textViewNote = (TextView) convertView.findViewById(R.id.textViewNote);
        Reminder reminder = getItem(position);
        textViewTitle.setText(reminder.getTitle());
        textViewNote.setText(reminder.getNote());
        return convertView;
    }
}
