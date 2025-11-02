package com.example.QuestionService.Controller;

import com.example.QuestionService.Entity.Question;
import com.example.QuestionService.Service.Implementation.QuestionServiceImplementation;
import com.example.QuestionService.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    //Create
    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }

    //Get All Question
    @GetMapping
    public List<Question> getAll(){
        return questionService.getAll();
    }

    //Get Question by ID
    @GetMapping("/{questionId}")
    public Question getById(@PathVariable Long questionId){
        return questionService.getById(questionId);
    }

    //Get all question of Specific quiz
    @GetMapping("/quiz/{quizId}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long quizId){
        return questionService.getQuestionsofQuiz(quizId);
    }
}
