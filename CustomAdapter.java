package com.example.cob155_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {
    private final Activity context;
    private final String text;
    public CustomAdapter(Activity context, String[] nameArrayParam, String textIn) {
        super(context, R.layout.row, nameArrayParam);
        this.context = context;
        this.text = textIn;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row,null,true);
        TextView textView = (TextView) rowView.findViewById(R.id.textRow);
        textView.setText(text);

        return rowView;
    }
}

