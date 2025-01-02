package com.proje.dto;

public class DtoTeacher {

    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public DtoTeacher() {
    }
    public DtoTeacher(String name, String department) {
        this.name = name;
        this.department = department;
    }
}
