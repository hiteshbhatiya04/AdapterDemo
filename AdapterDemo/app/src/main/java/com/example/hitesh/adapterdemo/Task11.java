package com.example.hitesh.adapterdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.hitesh.adapterdemo.Adapters.Task11Adapter;

public class Task11 extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task11);

        listView = (ListView) findViewById(R.id.list_countryn);

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

        Task11Adapter task11Adapter = new Task11Adapter(Task11.this,R.layout.task11_adapter,country_name,country_discr,country_image);
        listView.setAdapter(task11Adapter);
    }
}
