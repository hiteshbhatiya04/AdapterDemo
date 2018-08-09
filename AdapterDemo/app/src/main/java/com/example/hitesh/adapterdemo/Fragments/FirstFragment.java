package com.example.hitesh.adapterdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.hitesh.adapterdemo.Adapters.Fst_frg_Adapter;
import com.example.hitesh.adapterdemo.R;


public class FirstFragment extends Fragment {

    ListView list;

    public FirstFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,
                container, false);
        final String[] country_name = {"India","United States","United Kingdom","Argentina","South Africa",
                "Russia","New Zealand","Afghanistan","Canada"};
        list = (ListView) view.findViewById(R.id.fr_list);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getContext(), ""+country_name[i], Toast.LENGTH_SHORT).show();
            }
        });



        Fst_frg_Adapter fst_frg_adapter = new Fst_frg_Adapter(FirstFragment.this,R.layout.fst_frg_adapter,country_name);
        list.setAdapter(fst_frg_adapter);
        return view;

    }

}
