package com.olegbalj.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    SwitchCompat mainSwitch;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainSwitch = findViewById(R.id.switch1);
        layout = findViewById(R.id.layout);
        layout.setBackgroundColor(Color.rgb(255, 102, 153));
        mainSwitch.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (buttonView.getId() == mainSwitch.getId() && mainSwitch.isChecked())
            layout.setBackgroundColor(Color.rgb(102, 153, 255));
        else
            layout.setBackgroundColor(Color.rgb(255, 102, 153));

    }
}