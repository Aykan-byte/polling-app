package com.proje.controller;

import com.proje.dto.DtoTeacher;
import com.proje.model.Teacher;

import java.util.List;

public interface ITeacherController {
    public DtoTeacher findTeacherById(Long id);
    public List<DtoTeacher> getAllTeachers();
    public DtoTeacher saveTeacher(Teacher teacher);
    public DtoTeacher deleteTeacher(Long id);
}
