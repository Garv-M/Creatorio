package com.example.hack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Res_adapter extends ArrayAdapter<Res> {

    private Context mContext;
    private int mResources;

    public Res_adapter(@NonNull Context context, int resource, @NonNull ArrayList<Res> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResources = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        convertView = layoutInflater.inflate(mResources, parent, false);
        ImageView imageView = convertView.findViewById(R.id.list_img);
        TextView textView = convertView.findViewById(R.id.text_list);

        imageView.setImageResource(getItem(position).getS());
        textView.setText(getItem(position).getText());
        return convertView;
    }

}
