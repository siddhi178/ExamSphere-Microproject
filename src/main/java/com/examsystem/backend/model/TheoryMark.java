package com.examsystem.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "theory_marks")
public class TheoryMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long studentId;
    private String subjectName;
    private String semester;
    private double marksObtained;
    private double maxMarks;
    private String status;

    public TheoryMark() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getStudentId() { return studentId; }
    public void setStudentId(Long studentId) { this.studentId = studentId; }
    public String getSubjectName() { return subjectName; }
    public void setSubjectName(String subjectName) { this.subjectName = subjectName; }
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    public double getMarksObtained() { return marksObtained; }
    public void setMarksObtained(double marksObtained) { this.marksObtained = marksObtained; }
    public double getMaxMarks() { return maxMarks; }
    public void setMaxMarks(double maxMarks) { this.maxMarks = maxMarks; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}