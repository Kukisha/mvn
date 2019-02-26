package com.example.marko.logreg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvn);

        final EditText R_username = (EditText)findViewById(R.id.R_username);
        final EditText R_password = (EditText)findViewById(R.id.R_password);
        final Button R_button = (Button) findViewById(R.id.R_button);
    }
}
