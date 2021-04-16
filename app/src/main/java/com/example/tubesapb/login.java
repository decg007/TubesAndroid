package com.example.tubesapb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void onClickListen(View v) {
        String[] phoneNumber;
        if (!isValidMobile(phoneNumber[0])) {
            Toast.makeText(getApplicationContext(), "Phone Number Invalid", Toast.LENGTH_SHORT).show();
            return;
        } else {
            Intent intent = new Intent(login.this, MainActivity.class);
            startActivity(intent);
        }
    }
    private boolean isValidMobile(String phoneNumber) {
        return android.util.Patterns.PHONE.matcher(phoneNumber).matches();
    }
}