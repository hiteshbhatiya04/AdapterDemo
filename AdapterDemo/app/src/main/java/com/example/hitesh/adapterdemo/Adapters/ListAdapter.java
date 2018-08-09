package com.example.hitesh.adapterdemo.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.ListActivity;
import com.example.hitesh.adapterdemo.R;

public class ListAdapter extends BaseAdapter {

    ListActivity listActivity;
    int list_adapter;
    String[] country_name,country_discr;
    LayoutInflater inflater;
    int[] country_image;
    public ListAdapter(ListActivity listActivity, int list_adapter, String[] country_name, String[] country_discr, int[] country_image) {

        this.listActivity = listActivity;
        this.list_adapter = list_adapter;
        this.country_name = country_name;
        this.country_discr = country_discr;
        this.country_image = country_image;
    }

    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


        view = inflater.from(listActivity).inflate(list_adapter,null);
        ImageView image = (ImageView)view.findViewById(R.id.c_image);
        TextView name = (TextView)view.findViewById(R.id.txt_name);
        TextView discription = (TextView)view.findViewById(R.id.txt_description);

        image.setImageResource(country_image[i]);
        discription.setText(country_discr[i]);
        name.setText(country_name[i]);


        return view;
    }
}
