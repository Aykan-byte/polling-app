package com.proje.model;

import com.proje.dto.DtoTeacher;
import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class Lesson {
    @Id
    @Column(name = "class_id")
    private String classId;

    @Column(name = "class_name")
    private String className;

    @Column(name = "department")
    private String department;


    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacherId;

    public String getId() {
        return classId;
    }

    public void setId(String id) {
        this.classId = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Teacher getTeacher() {
        return teacherId;
    }

    public void setTeacher(Teacher teacher) {
        this.teacherId = teacher;
    }

    public Lesson() {
    }

    public Lesson(String classId, String className, String department, Teacher teacher) {
        this.classId = classId;
        this.className = className;
        this.department = department;
        this.teacherId = teacher;
    }
}
