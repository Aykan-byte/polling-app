package com.proje.controller;

import com.proje.dto.DtoStudent;
import com.proje.dto.DtoTeacher;
import com.proje.model.Student;
import com.proje.model.Teacher;

import java.util.List;

public interface IStudentController {

    public DtoStudent findStudentById(Long id);

    public List<DtoStudent> getAllStudents();

    public DtoStudent saveStudent(Student student);
    public DtoStudent deleteStudent(Long id);

    public DtoStudent loginStudent(String id, String password);

}
