package com.example.udesc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void inputAnswer (View v) {
        Button btnClicked = (Button)v;
        String getAnswer = btnClicked.getText().toString();
        Intent checkAnswer = new Intent(this, RespostaTest.class);
        checkAnswer.putExtra("answer", getAnswer);
        startActivity(checkAnswer);
    }

}
