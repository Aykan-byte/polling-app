package com.proje.controller.impl;

import com.proje.controller.ITeacherController;
import com.proje.dto.DtoStudent;
import com.proje.dto.DtoTeacher;
import com.proje.model.Teacher;

import com.proje.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/school")
public class TeacherControllerimpl implements ITeacherController {
    @Autowired
     private TeacherServiceImpl pollingService;
    @Override
    @GetMapping(path = "/teacher/list/{id}")
    public DtoTeacher findTeacherById(@PathVariable(value = "id") Long id) {
        return pollingService.findTeacherById(id);
    }

    @Override
    @GetMapping(path = "/teacher/list")
    public List<DtoTeacher> getAllTeachers() {
        return pollingService.getAllTeachers();
    }

    @Override
    @PostMapping(path = "/teacher/save")
    public DtoTeacher saveTeacher(@RequestBody Teacher teacher) {
        return pollingService.saveTeacher(teacher);
    }

    @Override
    @DeleteMapping(path = "/teacher/delete/{id}")
    public DtoTeacher deleteTeacher(@PathVariable(value = "id") Long id) {
        return pollingService.deleteTeacher(id);
    }
    @Override
    @GetMapping("/teacher/login/{email}&{password}")
    public DtoTeacher loginTeacher(@PathVariable(value = "email") String email, @PathVariable(value = "password") String password) {

        return pollingService.loginTeacher(email,password);
    }}
