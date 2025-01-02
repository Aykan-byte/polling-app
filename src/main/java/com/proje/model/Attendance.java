package com.proje.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "class_id", nullable = false)
    private Lesson lesson;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;

    @PreUpdate
    public void updateTimestamp() {
        this.timestamp = LocalDateTime.now();
    }

    @Column(name = "count", nullable = false)
    private int count;

    public void incrementCount() {
        this.count++;
    }


    public Attendance() {}

    public Attendance(Student student, Lesson lesson, LocalDateTime timestamp, int count) {
        this.student = student;
        this.lesson = lesson;
        this.timestamp = timestamp;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}