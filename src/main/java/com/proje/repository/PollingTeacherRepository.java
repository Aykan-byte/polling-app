package com.proje.repository;

import com.proje.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollingTeacherRepository extends JpaRepository<Teacher,Long > {
}
