package com.proje.service.impl;

import com.proje.model.Lesson;
import com.proje.repository.PollingLessonRepository;
import com.proje.service.ILessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements ILessonService {

    @Autowired
    private PollingLessonRepository lessonRepository;
    @Override
    public Lesson findLessonById(String id) {
        Optional<Lesson> optional = lessonRepository.findById(id);
        if (optional.isEmpty()){
            return null;
        }
        return optional.get();
    }

    @Override
    public List<Lesson> getAllLesson() {
        List<Lesson> lessontList = lessonRepository.findAll();
        return lessontList;
    }

    @Override
    public Lesson saveLesson(Lesson lessons) {
        lessonRepository.save(lessons);
        return lessons;
    }

    @Override
    public Lesson deleteLesson(String id) {
        Optional<Lesson> optional = lessonRepository.findById(id);
        if (optional.isPresent()){
            lessonRepository.delete(optional.get());
        }
        Lesson lesson = optional.get();
        return lesson;
    }
}
