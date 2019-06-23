package com.example.udesc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;


public class Question3 extends AppCompatActivity {

    private HashMap<String, String> answers = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question3);
        Intent i = getIntent();
        answers = (HashMap) i.getExtras().get("answers");
    }

    public void inputAnswer(View v) {
        Button btnClicked = (Button) v;
        String getAnswer = btnClicked.getText().toString();
        answers.put("resposta3", getAnswer);

        Intent nextQuestion = new Intent(this, Result.class);
        nextQuestion.putExtra("answers", answers);
        startActivity(nextQuestion);
    }
}
