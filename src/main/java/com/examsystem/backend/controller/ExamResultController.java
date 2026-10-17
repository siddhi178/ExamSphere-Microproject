package com.examsystem.backend.controller;

import com.examsystem.backend.model.ExamResult;
import com.examsystem.backend.repository.ExamResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/results")
@CrossOrigin(origins = "*")
public class ExamResultController {

    @Autowired
    private ExamResultRepository resultRepository;

    @GetMapping
    public List<ExamResult> getAllResults() {
        return resultRepository.findAll();
    }

    @PostMapping
    public ExamResult saveResult(@RequestBody ExamResult result) {
        return resultRepository.save(result);
    }

    @DeleteMapping("/{id}")
    public void deleteResult(@PathVariable Long id) {
        resultRepository.deleteById(id);
    }
}