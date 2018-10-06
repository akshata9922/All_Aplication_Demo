package com.example.felix_its.allaplicationdemo.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.felix_its.allaplicationdemo.R;

public class SendMailActivity extends AppCompatActivity {
    private EditText edt_to,edt_subject, edt_message;
    private Button btnsend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);
        edt_to=findViewById(R.id.edt_to);
        edt_subject=findViewById(R.id.edt_subject);
        edt_message=findViewById(R.id.edt_message);
        btnsend=findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }

    private void sendMail()
    {


        String recipientList=edt_to.getText().toString();
        String[] recipient=recipientList.split(" ,");

        String subject=edt_subject.getText().toString();
        String message=edt_message.getText().toString();

        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,recipient);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);

        intent.setType("message/rfc822");
        startActivity(intent.createChooser(intent,"Choose a email client"));

    }

}
