package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NicknameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nickname);
    }
    public void nickname(View view){
        EditText ednickname = findViewById(R.id.ed_nickname);
        String nickname = ednickname.getText().toString();
        if(nickname.equals("jack")){
            Toast.makeText(this,"請輸入年齡",Toast.LENGTH_LONG).show();
            getIntent().putExtra("NICKNAME",nickname);
            setResult(RESULT_OK,getIntent());
            Intent intent = new Intent(this,AgeActivity.class);
        }else{}

    }

}
