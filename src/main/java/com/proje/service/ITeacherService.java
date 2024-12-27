package com.proje.service;

import com.proje.dto.DtoStudent;
import com.proje.dto.DtoTeacher;
import com.proje.model.Teacher;

import java.util.List;

public interface ITeacherService {
    public DtoTeacher findTeacherById(Long id);

    public List<DtoTeacher> getAllTeachers();
    public DtoTeacher saveTeacher(Teacher teacher);
    public DtoTeacher deleteTeacher(Long id);
    public DtoTeacher loginTeacher(String email, String password);

}
