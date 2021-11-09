package com.example.pda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class free_board extends AppCompatActivity {
    private LinearLayout post;
    private TextView postName;
    private TextView postUser;
    private TextView postTime;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_board);

        post = findViewById(R.id.post);
        postName = findViewById(R.id.postName);
        postUser = findViewById(R.id.postUser);
        postTime = findViewById(R.id.postTime);
        title = findViewById(R.id.title);

        Intent o = getIntent();
        String ti = o.getStringExtra("title");
        String val = o.getStringExtra("value");                 //val값으로 불러올 데이터 sheet 제어
        title.setText(ti);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(free_board.this, frame.class);
                startActivity(go);
            }
        });
    }
}