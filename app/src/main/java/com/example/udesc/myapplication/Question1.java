package com.example.udesc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import java.util.HashMap;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question1);
    }

    public void inputAnswer(View v) {
        Button btnClicked = (Button) v;
        String getAnswer = btnClicked.getText().toString();
        HashMap<String, String> answers = new HashMap<String, String>();
        answers.put("resposta1", getAnswer);

        Intent addAnswer = new Intent(this, Question2.class);
        addAnswer.putExtra("answers", answers);
        startActivity(addAnswer);
    }

}
