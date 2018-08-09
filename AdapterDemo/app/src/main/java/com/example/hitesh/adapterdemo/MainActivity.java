package com.example.hitesh.adapterdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button list,grid,task11,task12,task13,taskbn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (Button)findViewById(R.id.btn_list);
        grid = (Button)findViewById(R.id.btn_grid);
        task11 = (Button)findViewById(R.id.btn_task11);
        task12 = (Button)findViewById(R.id.btn_task12);
        task13 = (Button)findViewById(R.id.btn_task13);
        taskbn = (Button)findViewById(R.id.btn_bottom);

        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ListActivity.class);
                startActivity(i);
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,GridActivity.class);
                startActivity(i);
            }
        });
        task11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Task11.class);
                startActivity(i);
            }
        });
        task12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Task12.class);
                startActivity(i);
            }
        });
        task13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Task13.class);
                startActivity(i);
            }
        });
        taskbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BottomNav.class);
                startActivity(i);
            }
        });
    }
}
