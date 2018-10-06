package com.example.felix_its.allaplicationdemo.Activity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.felix_its.allaplicationdemo.R;

public class MakeCallActivity extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private EditText edtnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_call);
        edtnumber = findViewById(R.id.edtnumber);
        ImageView imagecall = findViewById(R.id.imgcall);

        imagecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                makePhoneCall();

            }
        });
    }

    ;

    @SuppressLint("MissingPermission")
    private void makePhoneCall() {
        String number = edtnumber.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(MakeCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(MakeCallActivity.this,new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL);
            } else {
                String dail = "tel:" + number;
                startActivity( new Intent(Intent.ACTION_CALL,Uri.parse(dail)));
            }

        }
        else{
            Toast.makeText(MakeCallActivity.this, "Enter Phone Number", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if (requestCode==REQUEST_CALL)
        {
            if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED)
            {
                makePhoneCall();
            }
            else
            {
                Toast.makeText(this,"Permission DENIED",Toast.LENGTH_SHORT).show();
            }
        }
    }
}

