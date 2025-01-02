package com.proje.repository;

import com.proje.model.Attendance;
import com.proje.model.Student;
import com.proje.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
    Attendance findByStudentAndLesson(Student student, Lesson lesson);
    List<Attendance> findAllByLesson(Lesson lesson);
}