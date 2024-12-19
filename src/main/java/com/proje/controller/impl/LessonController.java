package com.proje.controller.impl;

import com.proje.controller.ILessonController;
import com.proje.dto.DtoLesson;
import com.proje.model.Lesson;
import com.proje.service.impl.LessonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/school")
public class LessonController implements ILessonController {
    @Autowired
    private LessonServiceImpl lessonService;

    @Override
    @GetMapping(path = "/lesson/list/{id}")
    public Lesson findLessonById(@PathVariable(value = "id") String id) {
        return lessonService.findLessonById(id);
    }


    @Override
    @GetMapping(path = "/lesson/list")
    public List<Lesson> getAllLesson() {
        return lessonService.getAllLesson();
    }

    @Override
    @PostMapping(path = "/lesson/save")
    public Lesson saveLesson(@RequestBody Lesson lessons) {
        return lessonService.saveLesson(lessons);
    }

    @Override
    @DeleteMapping(path = "/lesson/delete/{id}")
    public Lesson deleteLesson(@PathVariable(value = "id") String id) {
        return lessonService.deleteLesson(id);
    }
}
