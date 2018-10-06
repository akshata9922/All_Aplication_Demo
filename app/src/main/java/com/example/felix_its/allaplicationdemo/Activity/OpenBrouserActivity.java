package com.example.felix_its.allaplicationdemo.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.felix_its.allaplicationdemo.R;

public class OpenBrouserActivity extends AppCompatActivity {
    Button btnbrouser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_brouser);

        btnbrouser=findViewById(R.id.btnbrouser);

        btnbrouser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://WWW.Google.com";
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
