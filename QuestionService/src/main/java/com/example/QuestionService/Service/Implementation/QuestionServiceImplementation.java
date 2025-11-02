package com.example.QuestionService.Service.Implementation;

import com.example.QuestionService.Entity.Question;
import com.example.QuestionService.Repository.QuestionRepository;
import com.example.QuestionService.Service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImplementation implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImplementation(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question getById(long id) {
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Question> getQuestionsofQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
