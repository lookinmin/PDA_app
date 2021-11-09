package com.example.pda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Posting extends AppCompatActivity {

    String[] boards = {"게시판선택", "자유게시판", "공지사항", "건의사항", "공모전", "기출문제"};
    String[] grades = {"학년선택", "4학년", "3학년", "2학년", "1학년"};

    private Spinner gradeList;
    private EditText postTitle;
    private Button postBtn;
    boolean boardFlag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posting);

        gradeList = findViewById(R.id.gradeList);
        postTitle = findViewById(R.id.postTitle);
        postBtn = findViewById(R.id.postBtn);

        Spinner boardSpinner = findViewById(R.id.boardList);
        ArrayAdapter<String> boardAdapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, boards);
        boardAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        boardSpinner.setAdapter(boardAdapter);
        boardSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                boardFlag = true;
                if(position==0)
                    boardFlag = false;
                if(position == 5){
                    Toast.makeText(Posting.this, "족보", Toast.LENGTH_SHORT).show();
                    gradeList.setVisibility(View.VISIBLE);
                    Spinner gradeSpinner = findViewById(R.id.gradeList);
                    ArrayAdapter<String> gradeAdapter = new ArrayAdapter<String>(Posting.this, android.R.layout.simple_spinner_item, grades);
                    gradeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                    gradeSpinner.setAdapter(gradeAdapter);
                    gradeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if(position==0)
                                boardFlag = false;
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {
                            boardFlag = false;
                        }
                    });
                }
                else{
                    gradeList.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                boardFlag = false;
                Toast.makeText(getApplicationContext(), "선택되지 않음", Toast.LENGTH_LONG).show();
            }
        });

        postBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(postTitle.getText().toString().length() == 0 || !boardFlag ) {
                    Toast.makeText(Posting.this, "필수 기입사항을 입력해주세요", Toast.LENGTH_SHORT).show();
                }
                Toast.makeText(Posting.this, "btn clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}