package com.reddogsoftware.mbresnan.calculatorclone;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText displayLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        setContentView(R.layout.activity_main);

        displayLabel = findViewById(R.id.displayLabel);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            displayLabel.setShowSoftInputOnFocus(false);
        } else {
            displayLabel.setTextIsSelectable(true);
        }


    }
}
