package com.example.comp2000setexercises;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EmployeeHolidayFragment extends Fragment {
    FloatingActionButton newHolidayFab;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee_holiday, container, false);

        newHolidayFab = view.findViewById(R.id.newHolidayFab);

        newHolidayFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewHolidayPopover();
            }
        });

        return view;
    }

    void openNewHolidayPopover() {
        // TODO sort this out
    }
}