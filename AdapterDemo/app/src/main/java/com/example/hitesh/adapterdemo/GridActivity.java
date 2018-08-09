package com.example.hitesh.adapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.hitesh.adapterdemo.Adapters.GridAdapter;

public class GridActivity extends AppCompatActivity {

    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        grid = (GridView)findViewById(R.id.grid_country);



        String[] country_name = {"India","United States","United Kingdom","Argentina","South Africa",
                                "Russia","New Zealand","Afghanistan","Canada"};

        int[] country_image = {R.mipmap.india,R.mipmap.united_states,R.mipmap.united_kingdom,R.mipmap.argentina,
                R.mipmap.south_africa,R.mipmap.russia,R.mipmap.new_zealand,R.mipmap.afghanistan,R.mipmap.canada};

        /*int[] country_image = {R.drawable.india,R.drawable.united_states,R.drawable.united_kingdom,R.drawable.argentina,
                R.drawable.south_africa,R.drawable.russia,R.drawable.new_zealand,R.drawable.afghanistan,R.drawable.canada};*/

        GridAdapter adapter = new GridAdapter(GridActivity.this,R.layout.grid_adapter,country_name,country_image);
        grid.setAdapter(adapter);


    }
}
