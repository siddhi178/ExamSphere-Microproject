package com.examsystem.backend.repository;

import com.examsystem.backend.model.TheoryMark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheoryMarkRepository extends JpaRepository<TheoryMark, Long> {
}