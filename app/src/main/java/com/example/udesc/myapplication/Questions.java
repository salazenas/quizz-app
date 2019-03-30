package com.example.udesc.myapplication;

import com.example.udesc.myapplication.models.QuestionsInterface;
import java.util.*;

public class Questions implements QuestionsInterface {

    String[] question1 = {"Vovó Juju", "Juca", "Mãe Dina","0"};
    String[] question2 = {"Jorel", "Pocahontas","Tupã","0"};
    String[] question3 = {"Ana Catarina", "Dafine", "Lindinha","0"};

    private Map<Integer, String[]> mapaNomes = new HashMap<Integer, String[]>();

    Questions () {
        mapaNomes.put(1, question1);
        mapaNomes.put(2, question2);
        mapaNomes.put(3, question3);
    }

    public String[] getQuestions(int questionId) {
        return mapaNomes.get(questionId);
    };

    public Map<Integer, String[]> getAllQuestions() {
        return mapaNomes;
    }

    public String getAnswer(int questionId) {

        String[] questions = mapaNomes.get(questionId);

        System.out.println(questions[Integer.valueOf(questions[questions.length -1])]);

        return questions[Integer.valueOf(questions[questions.length -1])];
    };


}
