package com.example.hitesh.adapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hitesh.adapterdemo.Adapters.ListAdapter;


public class ListActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        list = (ListView) findViewById(R.id.list_country);

        String[] country_name = {"India","United States","United Kingdom","Argentina","South Africa",
                                    "Russia","New Zealand","Afghanistan","Canada"};
        String[] country_discr = {"India is one of the country on the earth.It's flag is shown left side",
                "United States is one of the country on the earth.It's flag is shown left side",
                "United Kingdom is one of the country on the earth.It's flag is shown left side",
                "Argentina is one of the country on the earth.It's flag is shown left side",
                "South Africa is one of the country on the earth.It's flag is shown left side",
                "Russia is one of the country on the earth.It's flag is shown left side",
                "New Zealand is one of the country on the earth.It's flag is shown left side",
                "Afghanistan is one of the country on the earth.It's flag is shown left side",
                "Canada is one of the country on the earth.It's flag is shown left side"};

        int[] country_image = {R.mipmap.india,R.mipmap.united_states,R.mipmap.united_kingdom,R.mipmap.argentina,
                R.mipmap.south_africa,R.mipmap.russia,R.mipmap.new_zealand,R.mipmap.afghanistan,R.mipmap.canada};

        /*int[] country_image = {R.mipmap.india,R.drawable.united_states,R.drawable.united_kingdom,R.drawable.argentina,
                R.drawable.south_africa,R.drawable.russia,R.drawable.new_zealand,R.drawable.afghanistan,R.drawable.canada};*/

        ListAdapter adapter = new ListAdapter(ListActivity.this,R.layout.list_adapter,country_name,country_discr,country_image);
        list.setAdapter(adapter);

    }
}
