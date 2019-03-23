package com.example.udesc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class RespostaTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_test);
        Intent i = getIntent();

        if(checkAnswer(i)) {
            System.out.println("Acertou");
        } else {
            System.out.println("Errou");
        }

        final LinearLayout lm = (LinearLayout) findViewById(R.id.linearMain);

        // create the layout params that will be used to define how your
        // button will be displayed
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

        //Create four
        for(i


    }

    public Boolean checkAnswer (Intent i) {
        String answer = i.getStringExtra("answer");
        return answer.equals("Vovó Juju");
    }
}
