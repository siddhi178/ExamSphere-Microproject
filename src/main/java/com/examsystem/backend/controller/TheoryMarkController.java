package com.examsystem.backend.controller;

import com.examsystem.backend.model.TheoryMark;
import com.examsystem.backend.repository.TheoryMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/theory-marks")
@CrossOrigin(origins = "*")
public class TheoryMarkController {
    @Autowired
    private TheoryMarkRepository repository;

    @GetMapping
    public List<TheoryMark> getAllMarks() { return repository.findAll(); }

    @PostMapping
    public TheoryMark saveMark(@RequestBody TheoryMark mark) {
        return repository.save(mark);
    }
}