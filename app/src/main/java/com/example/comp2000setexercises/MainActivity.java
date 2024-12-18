package com.example.comp2000setexercises;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    TextView errorLabel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        loginButton = findViewById(R.id.loginButton);
        errorLabel = findViewById(R.id.errorLabel);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double choice = Math.random() * 3;

                // If i show the error on the prior click, it must be hidden on the next attempt
                hideError();

                // TODO delete me
                choice = 1.5;

                if (choice < 1) {
                    // Goto emplyee side
                    Intent intent = new Intent(MainActivity.this, EmployeeActivity.class);
                    MainActivity.this.startActivity(intent);
                } else if (choice < 2) {
                    Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                    MainActivity.this.startActivity(intent);
                    // Goto admin side
                } else {
                    showError();
                }

            }
        });
    }

    void hideError() {
        errorLabel.setVisibility(View.GONE);
    }

    void showError() {
        errorLabel.setVisibility(View.VISIBLE);
    }
}