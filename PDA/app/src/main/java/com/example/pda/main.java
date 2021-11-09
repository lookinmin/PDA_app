package com.example.pda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class main extends AppCompatActivity {
    private LinearLayout info;
    private ImageView info_icon;
    private Button Free;
    private Button Notice;
    private Button Ask;
    private Button GongMo;
    private Button JockBo;
    private ImageView pencil;
    private LinearLayout write;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (LinearLayout)findViewById(R.id.info);
        info_icon = (ImageView)findViewById(R.id.info_icon);
        Free = (Button)findViewById(R.id.Free);
        Notice = (Button)findViewById(R.id.Notice);
        Ask = (Button)findViewById(R.id.Ask);
        GongMo = (Button)findViewById(R.id.Gongmo);
        JockBo = (Button)findViewById(R.id.JockBo);
        pencil = (ImageView)findViewById(R.id.pencil);
        write = (LinearLayout)findViewById(R.id.write);

        info_icon.setImageResource(R.drawable.user);
        pencil.setImageResource(R.drawable.pencil);
        //------------여기까지 Setting----------------------//

        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(main.this, Posting.class);
                startActivity(intent);
            }
        });
        Intent free = new Intent(main.this, free_board.class);
        Free.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.putExtra("title", "자유게시판");
                free.putExtra("value", 1);
                startActivity(free);
            }
        });

        Notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.putExtra("title", "공지사항");
                free.putExtra("value", 2);
                startActivity(free);
            }
        });

        Ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.putExtra("title", "건의사항");
                free.putExtra("value", 3);
                startActivity(free);
            }
        });

        GongMo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                free.putExtra("title", "공모전");
                free.putExtra("value", 4);
                startActivity(free);
            }
        });

        JockBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, Jockbo.class);
                startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main.this, Myinfo.class);
                startActivity(intent);
            }
        });
    }
}