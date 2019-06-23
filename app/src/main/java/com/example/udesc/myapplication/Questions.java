package com.example.udesc.myapplication;

import com.example.udesc.myapplication.models.QuestionsInterface;

import java.util.*;

public class Questions implements QuestionsInterface {

    String[] question1 = {"Vovó Juju", "Juca", "Mãe Dina"};
    String[] question2 = {"Perdigoto", "Seu Edson", "William Shostners"};
    String[] question3 = {"Samantha", "Jennifer", "Danuza"};

    private Map<Integer, String[]> mapaQuestoes = new HashMap<Integer, String[]>();

    Questions() {
        mapaQuestoes.put(1, question1);
        mapaQuestoes.put(2, question2);
        mapaQuestoes.put(3, question3);
    }

    public String[] getQuestions(int questionId) {
        return mapaQuestoes.get(questionId);
    }

    public Map<Integer, String[]> getAllQuestions() {
        return mapaQuestoes;
    }

    public String getAnswer(int questionId) {

        String[] question = mapaQuestoes.get(questionId);

        return question[0];
    }
}
