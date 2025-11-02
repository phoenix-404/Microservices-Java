package com.example.QuestionService.Service;

import com.example.QuestionService.Entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);

    List<Question> getAll();

    Question getById(long id);

    List<Question> getQuestionsofQuiz(Long quizId);

}
