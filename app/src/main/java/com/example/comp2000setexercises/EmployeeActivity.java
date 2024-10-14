package com.example.comp2000setexercises;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;

public class EmployeeActivity extends AppCompatActivity {
    TabLayout tabs;

    FragmentContainerView settingsFrag, detailsFrag, holidayFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_employee);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tabs = findViewById(R.id.tabs);
        holidayFrag = findViewById(R.id.holidayFragment);
        settingsFrag = findViewById(R.id.settingsFragment);
        detailsFrag = findViewById(R.id.myDetailsFragment);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        detailsFrag.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        holidayFrag.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        settingsFrag.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        detailsFrag.setVisibility(View.GONE);
                        break;
                    case 1:
                        holidayFrag.setVisibility(View.GONE);
                        break;
                    case 2:
                        settingsFrag.setVisibility(View.GONE);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}