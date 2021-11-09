package com.example.pda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class SignUp extends AppCompatActivity {
    private EditText name;
    private EditText hakbun;
    private EditText pw;
    private EditText pwConfirm;
    private EditText testQ;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.name);
        hakbun = findViewById(R.id.hakbun);
        pw = findViewById(R.id.pw);
        pwConfirm = findViewById(R.id.pwConfirm);
        testQ = findViewById(R.id.testQ);
        signUp = findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = pw.getText().toString();
                String password2 = pwConfirm.getText().toString();
                String testInput = testQ.getText().toString();
                String testAns = "PDA";
                if(name.getText().toString().length()==0||hakbun.getText().toString().length()==0||
                        pw.getText().toString().length()==0||pwConfirm.getText().toString().length()==0|| testQ.getText().toString().length()==0) {
                    //하나라도 미기입시
                    AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
                    builder.setTitle("회원가입 실패").setMessage("정보를 모두 입력하세요");
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
                else{
                    if(password.equals(password2) && testInput.equals(testAns)){
                        Intent intent = new Intent(SignUp.this, login.class);
                        startActivity(intent);
                    }
                    else if(!password.equals(password2) && testInput.equals(testAns)){
                        AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
                        builder.setTitle("비밀번호 오류").setMessage("비밀번호가 일치하지 않습니다");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    else if(password.equals(password2)){
                        AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
                        builder.setTitle("인증 실패").setMessage("답이 일치하지 않습니다");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                }
            }
        });

    }
}