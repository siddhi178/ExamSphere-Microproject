package com.examsystem.backend.controller;

import com.examsystem.backend.model.Question;
import com.examsystem.backend.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "*")
public class QuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping("/exam/{examId}")
    public List<Question> getQuestionsByExam(@PathVariable Long examId) {
        return questionRepository.findByExamId(examId);
    }

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return questionRepository.save(question);
    }
    @DeleteMapping("/{id}")
public void deleteQuestion(@PathVariable Long id) {
    questionRepository.deleteById(id);
}
}