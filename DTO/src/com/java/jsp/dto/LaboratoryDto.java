package com.java.jsp.dto;

public class LaboratoryDto {
    String name;
    String semester;
    String lab;
    String details;

    public void setName(String name) {
        this.name = name;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }


    public String getName() {
        return name;
    }

    public String getSemester() {
        return semester;
    }

    public String getDetails() {
        return details;
    }

    public String getLab() {
        return lab;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "name='" + name + '\'' +
                ", semester='" + semester + '\'' +
                ", lab='" + lab + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
