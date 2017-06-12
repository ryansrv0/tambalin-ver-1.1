package com.tambalin.tambalin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ryan on 28/05/2017.
 */

public class ListAdapter extends ArrayAdapter<ListItem> {

    private int layout;


    public ListAdapter(Context context, int resource, List<ListItem> objects) {
        super(context, resource, objects);
        this.layout=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListItem item = getItem(position);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout,parent,false);

            ViewHolder holder = new ViewHolder();
            holder.nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
            holder.addressTextView = (TextView) convertView.findViewById(R.id.addressTextView);

            convertView.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.nameTextView.setText(item.getNama());
        holder.addressTextView.setText(item.getAlamat());

        return convertView;

    }
    private static class ViewHolder{
        public TextView nameTextView;
        public TextView addressTextView;

    }
}
