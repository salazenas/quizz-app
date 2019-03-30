package com.example.udesc.myapplication.models;

import java.util.Map;

public interface QuestionsInterface {

    public Map<Integer, String[]> getAllQuestions();

    public String[] getQuestions(int questionId);

    public String getAnswer(int questionId);

}
