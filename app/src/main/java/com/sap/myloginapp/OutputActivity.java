package com.sap.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        welcomeTextView = findViewById(R.id.welcomeTextView);

        Model model = Model.getInstance();
        String userName = model.getUserName();
        String welcome = "Hallo " + userName;

        welcomeTextView.setText(welcome);
    }
}