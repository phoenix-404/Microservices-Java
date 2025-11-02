package com.example.QuizService.Service;

import com.example.QuizService.Entity.Quiz;

import java.util.List;

public interface QuizService {

    //Add Single Quiz entry
    Quiz add(Quiz quiz);

    //Get all entries in Quiz Table
    List<Quiz> get();

    //Get any particular ID by QuizID
    Quiz getByID(long id);
}
