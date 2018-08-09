package com.example.hitesh.adapterdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.hitesh.adapterdemo.R;
import com.example.hitesh.adapterdemo.Adapters.Snd_frg_Adapter;


public class SecondFragment extends Fragment {

    GridView gridView;




    public SecondFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second,
                container, false);
        gridView = (GridView) view.findViewById(R.id.fr_grid);
        final String[] country_name = {"India","United States","United Kingdom","Argentina","South Africa",
                "Russia","New Zealand","Afghanistan","Canada"};
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {






                Toast.makeText(getContext(), ""+country_name[i], Toast.LENGTH_SHORT).show();
            }
        });




        Snd_frg_Adapter snd_frg_adapter = new Snd_frg_Adapter(SecondFragment.this,R.layout.snd_frg_adapter,country_name);
        gridView.setAdapter(snd_frg_adapter);
        return view;
    }

}
