package com.example.hitesh.adapterdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hitesh.adapterdemo.Fragments.LoginFragment;
import com.example.hitesh.adapterdemo.Fragments.RegistrationFragment;

public class Task13 extends AppCompatActivity {

    Button login,regi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task13);

        login = (Button) findViewById(R.id.btn_login);
        regi = (Button) findViewById(R.id.btn_registration);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = new LoginFragment();
        fragmentTransaction.add(R.id.frame, fragment);
        fragmentTransaction.commit();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = new LoginFragment();
                fragmentTransaction.replace(R.id.frame, fragment);
                fragmentTransaction.commit();
               /* Fragment fragment = new Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();*/
            }
        });

        /*Fragment fragment1 = new Fragment();
        FragmentTransaction fragmentTransaction = fragment1.beginTransaction();
        fragmentTransaction.replace(R.id.frame, initialFragment);
        fragmentTransaction.commit();*/
        //getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment).commit();

        regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment1 = new RegistrationFragment();
                fragmentTransaction.replace(R.id.frame, fragment1);
                fragmentTransaction.commit();
                /*Fragment fragment1 = new Fragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment1).commit();*/
            }
        });
    }
}
