package com.example.zyryanova_v_15;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class Notice extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notice);

        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView1 = findViewById(R.id.text1);

                if (isChecked) {
                    textView1.setTextColor(Color.parseColor("#00B6C4"));
                    textView1.setBackgroundResource(R.drawable.background1);
                } else {
                    textView1.setTextColor(Color.parseColor("#B1B1B1"));
                    textView1.setBackgroundResource(R.drawable.background);
                }
            }
        });
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView2 = findViewById(R.id.text2);

                if (isChecked) {
                    textView2.setTextColor(Color.parseColor("#00B6C4"));
                    textView2.setBackgroundResource(R.drawable.background1);
                } else {
                    textView2.setTextColor(Color.parseColor("#B1B1B1"));
                    textView2.setBackgroundResource(R.drawable.background);
                }
            }
        });
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                TextView textView3 = findViewById(R.id.text3);

                if (isChecked) {
                    textView3.setTextColor(Color.parseColor("#00B6C4"));
                    textView3.setBackgroundResource(R.drawable.background1);
                } else {
                    textView3.setTextColor(Color.parseColor("#B1B1B1"));
                    textView3.setBackgroundResource(R.drawable.background);
                }
            }
        });
    }
    public void back(View view){
        Intent i = new Intent(this, PersonalArea.class);
        startActivity(i);
    }
}
