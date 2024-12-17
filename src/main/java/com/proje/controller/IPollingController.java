package com.proje.controller;

import com.proje.model.Student;

import java.security.PublicKey;
import java.util.List;

public interface IPollingController {

    public Student findStudentById(Long id);

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);
}
