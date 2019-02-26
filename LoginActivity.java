package com.example.marko.logreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText L_username = (EditText)findViewById(R.id.L_username);
        final EditText L_password = (EditText)findViewById(R.id.L_password);
        final Button L_button = (Button) findViewById(R.id.L_button);

    }
    public void REGISTER_pozovi (View view){
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
