package com.example.comp2000setexercises;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class EmployeeSettingsFragment extends Fragment {
    Button goHomeButton, goAdminButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee_settings, container, false);
        goHomeButton = view.findViewById(R.id.goHomeButton);
        goAdminButton = view.findViewById(R.id.goAdminButton);

        goHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLogin();
            }
        });

        goAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAdmin();
            }
        });

        return view;
    }

    void goToLogin() {
        Intent intent = new Intent(getActivity(), MainActivity.class);
        this.startActivity(intent);
    }

    void goToAdmin() {
        Intent intent = new Intent(getActivity(), AdminActivity.class);
        this.startActivity(intent);
    }
}