package com.proje.service.impl;

import com.proje.model.Student;
import com.proje.repository.IPollingRepository;
import com.proje.service.IPollingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PollingServiceImpl implements IPollingService {

    @Autowired
    private IPollingRepository pollingRepository;


    @Override
    public Student findStudentById(Long id) {
        Optional<Student> optional = pollingRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
       List<Student> studentList = pollingRepository.findAll();
        return studentList;
    }

    @Override
    public Student saveStudent(Student student) {

        return pollingRepository.save(student);
    }


}
