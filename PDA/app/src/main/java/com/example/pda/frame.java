package com.example.pda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class frame extends AppCompatActivity {
    private TextView title;
    private ImageView pic;
    private TextView text;
    private TextView link;
    private TextView file;
    private LinearLayout comment;
    private TextView who;
    private TextView time;
    private TextView what;
    private TextView writer;
    private TextView write_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        title = findViewById(R.id.title);
        pic = findViewById(R.id.pic);
        text = findViewById(R.id.text);
        link = findViewById(R.id.link);
        file = findViewById(R.id.file);
        comment = findViewById(R.id.comment);
        who = findViewById(R.id.who);
        time = findViewById(R.id.time);
        what = findViewById(R.id.what);
        write_time = findViewById(R.id.write_time);
        writer = findViewById(R.id.writer);
    }
}