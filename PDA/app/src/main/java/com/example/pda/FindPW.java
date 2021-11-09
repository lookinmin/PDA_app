package com.example.pda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FindPW extends AppCompatActivity {

    private EditText name;
    private EditText hakbun;
    private EditText testQ;
    private Button getPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_pw);

        name = findViewById(R.id.name);
        hakbun = findViewById(R.id.hakbun);
        testQ = findViewById(R.id.testQ);
        getPW = findViewById(R.id.getPW);

        getPW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = name.getText().toString();
                String inputHakbun = hakbun.getText().toString();
                String inputAns = testQ.getText().toString();
                String userPW = "qwer1234";
                if(inputName.equals("rlarhkdah") && inputHakbun.equals("2018038065") && inputAns.equals("PDA") ){
                    AlertDialog.Builder builder = new AlertDialog.Builder(FindPW.this);
                    builder.setTitle("비밀번호").setMessage("비밀번호: "+userPW);
                    builder.setPositiveButton("LOGIN", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(FindPW.this, login.class);
                            startActivity(intent);
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });
    }
}