package com.proje.controller.impl;

import com.proje.controller.IStudentController;
import com.proje.dto.DtoStudent;
import com.proje.model.Student;
import com.proje.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/school")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private StudentServiceImpl pollingService;

    @Override
    @GetMapping(path = "/student/list/{id}")
    public DtoStudent findStudentById(@PathVariable(value = "id") Long id) {
        return pollingService.findStudentById(id);
    }

    @Override
    @GetMapping(path = "/student/list")
    public List<DtoStudent> getAllStudents() {
        return pollingService.getAllStudents();
    }

    @Override
    @PostMapping(path = "/student/save")
    public DtoStudent saveStudent(@RequestBody Student student) {
        return pollingService.saveStudent(student);
    }

    @Override
    @DeleteMapping(path = "/student/delete/{id}")
    public DtoStudent deleteStudent(@PathVariable(value = "id") Long id) {
        return  pollingService.deleteStudent(id);
    }

    @Override
    @GetMapping("/login/{id}&{password}")
    public DtoStudent loginStudent(@PathVariable(value = "id") Long id, @PathVariable(value = "password") String password) {

        return pollingService.loginStudent(id,password);
    }




}
