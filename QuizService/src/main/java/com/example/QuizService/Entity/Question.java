package com.example.QuizService.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Not saving into DATABASE, thus not giving @Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {

    //@Id and @GeneratedValue is also not added to it.

    private Long questionID;
    private String question;
    private Long quizId;
}