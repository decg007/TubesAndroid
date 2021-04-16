package com.example.tubesapb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void Copied(View view) {
        displayToast(getString(R.string.Copied_message));
    }
    public void onClickListen(View view) {
        Intent intent = new Intent(Payment.this, MainActivity.class);
        startActivity(intent);
    }
}