package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YearUpStudent {

    @Id
    private String userName;

    private String fName;
    private String lName;
    private String nickName;
    private String email;
    private String phoneNumber;
    private String education;//Most likely array
    private String bio;
    private String experience;//Most likely array
    private String skill;//Most likely array
//    private Post post;
    
    public YearUpStudent() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "YearUpStudent{" +
                "userName='" + userName + '\'' +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", education='" + education + '\'' +
                ", bio='" + bio + '\'' +
                ", experience='" + experience + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}
