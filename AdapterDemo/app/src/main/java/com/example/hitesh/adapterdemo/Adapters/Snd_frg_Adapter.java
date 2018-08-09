package com.example.hitesh.adapterdemo.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.Fragments.SecondFragment;
import com.example.hitesh.adapterdemo.R;

public class Snd_frg_Adapter extends BaseAdapter {
    SecondFragment secondFragment;
    int snd_frg_adapter;
    String[] country_name;
    LayoutInflater inflater;

    public Snd_frg_Adapter(SecondFragment secondFragment, int snd_frg_adapter, String[] country_name)
    {
        this.secondFragment = secondFragment;
        this.snd_frg_adapter = snd_frg_adapter;
        this.country_name = country_name;
    }

    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.from(secondFragment.getContext()).inflate(snd_frg_adapter, null);
        TextView name = (TextView) view.findViewById(R.id.txt_list);

        name.setText(country_name[i]);
        return view;
    }
}
