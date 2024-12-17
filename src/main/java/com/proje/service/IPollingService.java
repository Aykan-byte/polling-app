package com.proje.service;

import com.proje.model.Student;

import java.util.List;

public interface IPollingService {

    public Student findStudentById(Long id);

    public List<Student> getAllStudents();

    public Student saveStudent(Student student);
}
