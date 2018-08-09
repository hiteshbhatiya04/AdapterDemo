package com.example.hitesh.adapterdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.hitesh.adapterdemo.Fragments.FirstFragment;
import com.example.hitesh.adapterdemo.Fragments.LoginFragment;
import com.example.hitesh.adapterdemo.Fragments.RegistrationFragment;
import com.example.hitesh.adapterdemo.Fragments.SecondFragment;

public class BottomNav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        Fragment fragment = new SecondFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag_bottom, fragment).commit();
                        return true;
                    case R.id.navigation_dashboard:
                        Fragment fragment1 = new RegistrationFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag_bottom, fragment1).commit();
                        return true;
                    case R.id.navigation_notifications:
                        Fragment fragment2 = new LoginFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag_bottom, fragment2).commit();
                        return true;
                }
                return false;
            }
        });
    }

}
