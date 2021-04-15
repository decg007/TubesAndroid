package com.example.tubesapb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class pulsa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsa);
    }
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.duapuluhlima:
                if (checked)
                    break;
            case R.id.limapuluh:
                if (checked)
                    break;
            case R.id.tujuhpuluhlima:
                if (checked)
                    break;
            case R.id.seratus:
                if (checked)
                    break;
        }
    }
}