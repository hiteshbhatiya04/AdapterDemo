package com.example.hitesh.adapterdemo.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.R;
import com.example.hitesh.adapterdemo.Task11;

public class Task11Adapter extends BaseAdapter {
    Task11 task11;
    int task11_adapter;
    String[] country_name,country_discr;
    LayoutInflater inflater;
    int[] country_image;


    public Task11Adapter(Task11 task11, int task11_adapter, String[] country_name, String[] country_discr, int[] country_image) {

        this.task11 = task11;
        this.task11_adapter = task11_adapter;
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

        view = inflater.from(task11).inflate(task11_adapter,null);
        ImageView image = (ImageView)view.findViewById(R.id.image_task);
        TextView name = (TextView)view.findViewById(R.id.task_name);
        TextView discription = (TextView)view.findViewById(R.id.task_description);

        image.setImageResource(country_image[i]);
        discription.setText(country_discr[i]);
        name.setText(country_name[i]);


        return view;
    }
}
