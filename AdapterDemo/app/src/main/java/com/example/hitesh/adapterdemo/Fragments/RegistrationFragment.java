package com.example.hitesh.adapterdemo.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hitesh.adapterdemo.R;


public class RegistrationFragment extends Fragment {

    EditText email,password,number;
    Button registration;


    public RegistrationFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  v = inflater.inflate(R.layout.fragment_registration, container, false);

        email = (EditText)v.findViewById(R.id.edit_remail);
        password = (EditText)v.findViewById(R.id.edit_rpass);
        number = (EditText)v.findViewById(R.id.edit_number);
        registration = (Button) v.findViewById(R.id.btn_regi);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill = email.getText().toString();
                String passw = password.getText().toString();
                String mob = number.getText().toString();
                if (!Patterns.EMAIL_ADDRESS.matcher(emaill).matches());
                {
                    Toast.makeText(getContext(), "Please Enter Valid Email", Toast.LENGTH_SHORT).show();
                }
                if (passw.trim().isEmpty())
                {
                    Toast.makeText(getContext(), "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                if (mob.trim().isEmpty())
                {
                    Toast.makeText(getContext(), "Please Enter Mobile Number", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(getContext(), ""+emaill+"\n"+passw+"\n"+mob, Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

}
