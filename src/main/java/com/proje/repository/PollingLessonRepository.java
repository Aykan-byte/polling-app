package com.proje.repository;

import com.proje.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollingLessonRepository extends JpaRepository<Lesson,String> {
}
