package com.example.pda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Myinfo extends AppCompatActivity {
    private TextView name;
    private LinearLayout post;
    private TextView postname;
    private TextView category;
    private TextView time;
    private Button getout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myinfo);

        name = findViewById(R.id.name);
        post = findViewById(R.id.post);
        postname = findViewById(R.id.postName);
        category = findViewById(R.id.category);
        time = findViewById(R.id.postTime);
        getout = findViewById(R.id.getout);

        getout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Myinfo.this);
                builder.setTitle("PDA").setMessage("정말 탈퇴하시겠습니까?");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //탈퇴 시퀀스
                    }
                });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
}