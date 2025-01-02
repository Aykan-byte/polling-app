package com.proje.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "student_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "student")
    private Set<Attendance> studentLessons;


    public Student(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Student() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Attendance> getStudentLessons() {
        return studentLessons;
    }

    public void setStudentLessons(Set<Attendance> attendances) {
        this.studentLessons = attendances;
    }
}