package com.example.felix_its.allaplicationdemo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.felix_its.allaplicationdemo.R;

public class OpenWhatsappActivity extends AppCompatActivity {
    Button btnwhatsap;
    EditText edtwhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_whatsapp);
        btnwhatsap = findViewById(R.id.btnwhatsap);
        edtwhatsapp = findViewById(R.id.edtwhatsapp);


        btnwhatsap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sendMessage();
            }
        });
    }

    public void sendMessage() {

        String whatsAppMessage = edtwhatsapp.getText().toString();

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, whatsAppMessage);
        intent.setType("text/plain");

        intent.setPackage("com.whatsapp");
        startActivity(intent);

    }
}