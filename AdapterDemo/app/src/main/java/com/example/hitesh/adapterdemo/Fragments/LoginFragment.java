package com.example.hitesh.adapterdemo.Fragments;


import android.os.Bundle;
import android.os.PatternMatcher;
import android.support.v4.app.Fragment;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hitesh.adapterdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    EditText email,password;
    Button login;


    public LoginFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, container, false);
        email = (EditText)view.findViewById(R.id.edit_email);
        password = (EditText)view.findViewById(R.id.edit_pass);
        login = (Button) view.findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emaill = email.getText().toString();
                String passw = password.getText().toString();
                if (emaill.isEmpty() && !Patterns.EMAIL_ADDRESS.matcher(emaill).matches() )
                {
                    Toast.makeText(getContext(), "Please Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                /*if (!Patterns.EMAIL_ADDRESS.matcher(emaill).matches());
                {
                    Toast.makeText(getContext(), "Please Enter Valid Email", Toast.LENGTH_SHORT).show();
                }*/
                Toast.makeText(getContext(), ""+emaill+"\n"+passw, Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }

}
