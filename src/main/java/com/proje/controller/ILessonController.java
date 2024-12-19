package com.proje.controller;

import com.proje.dto.DtoLesson;
import com.proje.model.Lesson;

import java.util.List;

public interface ILessonController {
    public Lesson findLessonById(String id);

    public List<Lesson> getAllLesson();

    public Lesson saveLesson(Lesson lessons);
    public Lesson deleteLesson(String id);
}
