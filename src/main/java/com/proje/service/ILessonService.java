package com.proje.service;

import com.proje.dto.DtoLesson;
import com.proje.model.Lesson;

import java.util.List;

public interface ILessonService {
    public Lesson findLessonById(String id);
    public List<Lesson> getAllLesson();
    public Lesson saveLesson(Lesson lessons);
    public Lesson deleteLesson(String id);
}
