package com.proje.controller.impl;

import com.proje.controller.IPollingController;
import com.proje.model.Student;
import com.proje.service.impl.PollingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/rest/api/student")
public class PollingControllerImpl implements IPollingController {

    @Autowired
    private PollingServiceImpl pollingService;

    @Override
    @GetMapping(path = "/list/{id}")
    public Student findStudentById(@PathVariable(name = "id") Long id) {
        return pollingService.findStudentById(id);
    }

    @Override
    @GetMapping(path = "/list")
    public List<Student> getAllStudents() {
        return pollingService.getAllStudents();
    }

    @Override
    @PostMapping(path = "/save")
    public Student saveStudent(@RequestBody Student student) {
        return pollingService.saveStudent(student);
    }
}
