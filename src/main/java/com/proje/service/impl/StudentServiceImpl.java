package com.proje.service.impl;

import com.proje.dto.DtoStudent;
import com.proje.dto.DtoTeacher;
import com.proje.model.Student;
import com.proje.model.Teacher;
import com.proje.repository.PollingStudentRepository;
import com.proje.repository.PollingTeacherRepository;
import com.proje.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private PollingStudentRepository pollingStudentRepository;



    @Override
    public DtoStudent findStudentById(Long id) {
        DtoStudent dtoStudent = new DtoStudent();
        Optional<Student> optional = pollingStudentRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Student dbStudent = optional.get();
        BeanUtils.copyProperties(dbStudent, dtoStudent);

        return dtoStudent;
    }

    @Override
    public List<DtoStudent> getAllStudents() {
        List<DtoStudent> dtoList = new ArrayList<>();
        List<Student> studentList = pollingStudentRepository.findAll();
        for(Student student : studentList){
            DtoStudent dto = new DtoStudent();
            BeanUtils.copyProperties(student, dto);
            dtoList.add(dto);
        }
        return dtoList;
    }


    @Override
    public  DtoStudent saveStudent(Student student) {
        DtoStudent dtoStudent = new DtoStudent();
        BeanUtils.copyProperties(student, dtoStudent);
        pollingStudentRepository.save(student);
        return dtoStudent;
    }

    @Override
    public DtoStudent deleteStudent(Long id) {
        Optional<Student> optional= pollingStudentRepository.findById(id);
        if(optional.isPresent()){
            pollingStudentRepository.delete(optional.get());
        }
        DtoStudent dtoStudent = new DtoStudent();
        Student student = optional.get();
        BeanUtils.copyProperties(student, dtoStudent);
        return dtoStudent;
    }


}
