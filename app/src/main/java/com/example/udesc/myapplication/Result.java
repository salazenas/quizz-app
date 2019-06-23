package com.example.udesc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class Result extends AppCompatActivity {

    private HashMap<String, String> answers = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i = getIntent();
        Questions q = new Questions();
        Integer numeroAcertos = 0;

        answers = (HashMap) i.getExtras().get("answers");

        for (int cont = 1; cont <= 3; cont++) {
            if (answers.get("resposta" + cont).equals(q.getAnswer(cont))) {
                numeroAcertos += 1;
            }
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        TextView resultView = findViewById(R.id.result);

        if (numeroAcertos == 3) {
            resultView.setText("Parabéns. Você acertou todas as questões!");
        } else {
            resultView.setText("Número de acertos: " + numeroAcertos + " de 3!");
        }

        switch (numeroAcertos) {
            case 3:
                ImageView first = findViewById(R.id.first);
                first.setVisibility(ImageView.VISIBLE);
                break;
            case 2:
                ImageView second = findViewById(R.id.second);
                second.setVisibility(ImageView.VISIBLE);
                break;
            case 1:
                ImageView third = findViewById(R.id.third);
                third.setVisibility(ImageView.VISIBLE);
                break;
            case 0:
                ImageView noob = findViewById(R.id.noob);
                noob.setVisibility(ImageView.VISIBLE);
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Você concluiu o quizz!", Toast.LENGTH_LONG).show();
    }

    public void retry(View v) {
        Intent firstQuestion = new Intent(this, Question1.class);
        startActivity(firstQuestion);
    }

}
