package com.example.hitesh.adapterdemo.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.GridActivity;
import com.example.hitesh.adapterdemo.R;

public class GridAdapter extends BaseAdapter {
    GridActivity gridActivity;
    int grid_adapter;
    String[] country_name;
    LayoutInflater inflater;
    int[] country_image;

    public GridAdapter(GridActivity gridActivity, int grid_adapter, String[] country_name, int[] country_image) {
        this.gridActivity = gridActivity;
        this.grid_adapter = grid_adapter;
        this.country_name = country_name;
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
        view = inflater.from(gridActivity).inflate(grid_adapter,null);
        ImageView image = (ImageView)view.findViewById(R.id.c_image);
        TextView name = (TextView)view.findViewById(R.id.txt_countryname);

        image.setImageResource(country_image[i]);
        name.setText(country_name[i]);


        return view;
    }
}
