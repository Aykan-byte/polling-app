package com.proje.service.impl;

import com.proje.dto.DtoTeacher;
import com.proje.model.Teacher;
import com.proje.repository.PollingTeacherRepository;
import com.proje.service.ITeacherService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private PollingTeacherRepository pollingTeacherRepository;
    @Override
    public DtoTeacher findTeacherById(Long id) {
        DtoTeacher dtoTeacher = new DtoTeacher();
        Optional<Teacher> optional = pollingTeacherRepository.findById(id);
        if(optional.isEmpty()){
            return null;
        }
        Teacher dbTeacher = optional.get();
        BeanUtils.copyProperties(dbTeacher, dtoTeacher);

        return dtoTeacher;
    }

    @Override
    public List<DtoTeacher> getAllTeachers() {
        List<DtoTeacher> dtoList = new ArrayList<>();
        List<Teacher> teacherList = pollingTeacherRepository.findAll();
        for (Teacher teacher : teacherList){
            DtoTeacher dtoTeacher = new DtoTeacher();
            BeanUtils.copyProperties(teacher, dtoTeacher);
            dtoList.add(dtoTeacher);
        }
        return dtoList;
    }

    @Override
    public DtoTeacher saveTeacher(Teacher teacher) {
        DtoTeacher dtoTeacher = new DtoTeacher();
        BeanUtils.copyProperties(teacher, dtoTeacher);
        pollingTeacherRepository.save(teacher);
        return dtoTeacher;
    }

    @Override
    public DtoTeacher deleteTeacher(Long id) {
        Optional<Teacher> optional = pollingTeacherRepository.findById(id);
        if(optional.isPresent()){
            pollingTeacherRepository.delete(optional.get());
        }
        DtoTeacher dtoTeacher = new DtoTeacher();
        Teacher teacher = optional.get();
        BeanUtils.copyProperties(teacher, dtoTeacher);

        return dtoTeacher;

    }
}
