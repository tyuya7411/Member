package com.fju.member;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

    }
    public void age(View view){
        EditText edage = findViewById(R.id.ed_age);
        String age = edage.getText().toString();
        if(age.equals("21")){
            Toast.makeText(this,"請選擇性別",Toast.LENGTH_LONG).show();
            getIntent().putExtra("AGE",age);
            setResult(RESULT_OK,getIntent());
            Intent intent = new Intent(this,GenderActivity.class);
        }else{}

    }
}
