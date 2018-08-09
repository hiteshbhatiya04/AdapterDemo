package com.example.hitesh.adapterdemo.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.Fragments.FirstFragment;
import com.example.hitesh.adapterdemo.R;

public class Fst_frg_Adapter extends BaseAdapter {
    FirstFragment firstFragment;
    int fst_frg_adapter;
    String[] country_name;
    LayoutInflater inflater;

    public Fst_frg_Adapter(FirstFragment firstFragment, int fst_frg_adapter, String[] country_name)
    {

        this.firstFragment = firstFragment;
        this.fst_frg_adapter = fst_frg_adapter;
        this.country_name = country_name;
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
        view = inflater.from(firstFragment.getContext()).inflate(fst_frg_adapter, null);
        TextView name = (TextView) view.findViewById(R.id.txt_list);

        name.setText(country_name[i]);
        return view;
    }
}
