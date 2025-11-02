package com.example.QuizService.Controller;

import com.example.QuizService.Entity.Quiz;
import com.example.QuizService.Service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //Create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //Get All Quiz details
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    //Get Quiz detail by ID
    @GetMapping("/{id}")
    public Quiz getByID(@PathVariable Long id){
        return quizService.getByID(id);
    }

}
