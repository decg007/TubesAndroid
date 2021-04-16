package com.example.tubesapb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }
    public void displayToast(String message) {
        //dialog
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void onClickPay(View view) {
        //Implicit intent ke BCA Mobile
        displayToast(getString(R.string.pay_message));
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.bca")));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.bca")));
        }
    }
    public void onClickListen(View view) {
        //explicit intent ke activity_main
        Intent intent = new Intent(Payment.this, MainActivity.class);
        startActivity(intent);
    }
}