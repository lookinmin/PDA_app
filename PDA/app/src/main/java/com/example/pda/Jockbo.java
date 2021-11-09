package com.example.pda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Jockbo extends AppCompatActivity {
    private LinearLayout Grade1;
    private LinearLayout Grade2;
    private LinearLayout Grade3;
    private LinearLayout Grade4;
    private ImageView pic_1;
    private ImageView pic_2;
    private ImageView pic_3;
    private ImageView pic_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jockbo);

        Grade1 = (LinearLayout)findViewById(R.id.Grade1);
        Grade2 = (LinearLayout)findViewById(R.id.Grade2);
        Grade3 = (LinearLayout)findViewById(R.id.Grade3);
        Grade4 = (LinearLayout)findViewById(R.id.Grade4);
        pic_1 = (ImageView)findViewById(R.id.pic_1);
        pic_2 = (ImageView)findViewById(R.id.pic_2);
        pic_3 = (ImageView)findViewById(R.id.pic_3);
        pic_4 = (ImageView)findViewById(R.id.pic_4);
        pic_1.setImageResource(R.drawable.one);
        pic_2.setImageResource(R.drawable.two);
        pic_3.setImageResource(R.drawable.three);
        pic_4.setImageResource(R.drawable.four);


    }
}