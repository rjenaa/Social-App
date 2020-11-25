package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;
    private String degree;
    private String fieldOfStudy;
    private String startYear;
    private String endYear;
    private String currentGradeLevel;
    private String activities;

    public Education() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getCurrentGradeLevel() {
        return currentGradeLevel;
    }

    public void setCurrentGradeLevel(String currentGradeLevel) {
        this.currentGradeLevel = currentGradeLevel;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Education{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                ", degree='" + degree + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", startYear='" + startYear + '\'' +
                ", endYear='" + endYear + '\'' +
                ", currentGradeLevel='" + currentGradeLevel + '\'' +
                ", activities='" + activities + '\'' +
                '}';
    }
}
