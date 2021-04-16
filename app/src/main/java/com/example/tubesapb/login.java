package com.example.tubesapb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //lifecycle
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void displayToast(String message) {
        //dialog
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
    public void onClickListen(View view) {
        //explicit intent ke activity_main
        Intent intent = new Intent(login.this, MainActivity.class);
        startActivity(intent);
        displayToast(getString(R.string.Successful_message));
    }
}