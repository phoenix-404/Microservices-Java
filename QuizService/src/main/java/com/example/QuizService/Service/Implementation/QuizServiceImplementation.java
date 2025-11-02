package com.example.QuizService.Service.Implementation;

import com.example.QuizService.Entity.Quiz;
import com.example.QuizService.Repository.QuizRepository;
import com.example.QuizService.Service.QuestionClient;
import com.example.QuizService.Service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizServiceImplementation implements QuizService {

    private QuizRepository quizRepository;

//    private QuestionClient questionClient;
//
//    public QuizServiceImplementation(QuestionClient questionClient, QuizRepository quizRepository) {
//        this.questionClient = questionClient;
//        this.quizRepository = quizRepository;
//    }

    public QuizServiceImplementation(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
//        List<Quiz> quizzes = quizRepository.findAll();
//
//        List<Quiz> newQuizList = quizzes.stream().map(quiz -> {
//            quiz.setQuestions(questionClient.getQuestionsofQuiz(quiz.getId()));
//            return quiz;
//        }).collect(Collectors.toList());
//
//        return newQuizList;

        return quizRepository.findAll();
    }

    @Override
    public Quiz getByID(long id) {
      return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));

//        Quiz quiz = quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
//        quiz.setQuestions(questionClient.getQuestionsofQuiz((quiz.getId())));
//        return quiz;
    }

}
