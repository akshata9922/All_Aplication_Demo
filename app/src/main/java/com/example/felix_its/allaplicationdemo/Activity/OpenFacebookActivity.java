package com.example.felix_its.allaplicationdemo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.felix_its.allaplicationdemo.R;

public class OpenFacebookActivity extends AppCompatActivity {
    Button btnfacebook;
    EditText edtfacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_facebook);
        btnfacebook = findViewById(R.id.btnfacebook);
        edtfacebook = findViewById(R.id.edtfacebook);


        btnfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendFBMessage();
            }
        });
    }

    public void sendFBMessage() {

        String fecebookMessage = edtfacebook.getText().toString();

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, fecebookMessage);
        intent.setType("text/plain");

        intent.setPackage("com.facebook");
        startActivity(intent);

    }
}