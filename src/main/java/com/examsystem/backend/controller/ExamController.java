package com.examsystem.backend.controller;

import com.examsystem.backend.model.Exam;
import com.examsystem.backend.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/exams")
@CrossOrigin(origins = "*")
public class ExamController {
    @Autowired
    private ExamRepository examRepository;

    @GetMapping
    public List<Exam> getAllExams() { return examRepository.findAll(); }

    @PostMapping
    public Exam createExam(@RequestBody Exam exam) { return examRepository.save(exam); }

    @PutMapping("/{id}")
    public Exam updateExam(@PathVariable Long id, @RequestBody Exam examDetails) {
        Exam exam = examRepository.findById(id).orElseThrow();
        exam.setExamName(examDetails.getExamName());
        exam.setSubject(examDetails.getSubject());
        exam.setDuration(examDetails.getDuration());
        exam.setPublished(examDetails.isPublished());
        return examRepository.save(exam);
    }
}