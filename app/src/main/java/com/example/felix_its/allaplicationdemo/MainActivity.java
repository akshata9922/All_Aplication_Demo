package com.example.felix_its.allaplicationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.felix_its.allaplicationdemo.Activity.MakeCallActivity;
import com.example.felix_its.allaplicationdemo.Activity.OpenBrouserActivity;
import com.example.felix_its.allaplicationdemo.Activity.OpenFacebookActivity;
import com.example.felix_its.allaplicationdemo.Activity.OpenWhatsappActivity;
import com.example.felix_its.allaplicationdemo.Activity.SendMailActivity;
import com.example.felix_its.allaplicationdemo.Activity.SendSMSActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeCall(View view) {
        Intent intent=new Intent(MainActivity.this,MakeCallActivity.class);
        startActivity(intent);
    }

    public void sendSms(View view) {
        Intent intent=new Intent(MainActivity.this,SendSMSActivity.class);
        startActivity(intent);
    }

    public void openBrouser(View view) {
        Intent intent=new Intent(MainActivity.this,OpenBrouserActivity.class);
        startActivity(intent);
    }

    public void sendMail(View view) {
        Intent intent=new Intent(MainActivity.this,SendMailActivity.class);
        startActivity(intent);
    }

    public void openwhatsapp(View view) {
        Intent intent=new Intent(MainActivity.this,OpenWhatsappActivity.class);
        startActivity(intent);
    }

    public void openfacebook(View view) {
        Intent intent=new Intent(MainActivity.this,OpenFacebookActivity.class);
        startActivity(intent);
    }
}
