package com.example.QuizService.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Not saving into DATABASE

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    private Long questionID;
    private String question;

    private Long quizId;
}