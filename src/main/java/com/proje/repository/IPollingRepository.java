package com.proje.repository;

import com.proje.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPollingRepository extends JpaRepository<Student,Long> {
}