package com.yearup.socialapp.services;


import com.yearup.socialapp.AWS.FileService;
import com.yearup.socialapp.models.YearUpStudent;
import com.yearup.socialapp.repositories.YearUpStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class YearUpStudentService {

    @Autowired
    YearUpStudentRepository yearUpStudentRepository;

    @Autowired
    AccountService accountService;

    @Autowired
    FileService fileService;

    public Optional<YearUpStudent> getYearUpStudentByID(Long Id){
        return yearUpStudentRepository.findById(Id);
    }

    public Optional<YearUpStudent> getYearUpStudentByFirstName(String fName){
        return yearUpStudentRepository.findYearUpStudentByFirstName(fName);
    }

    public Optional<YearUpStudent> getYearUpStudentByLastName(String lName){
        return yearUpStudentRepository.findYearUpStudentByFirstName(lName);
    }

    public Optional<YearUpStudent> getYearUpStudentByAccountID(Long Id){
        return yearUpStudentRepository.findYearUpStudentByAccountId(Id);
    }

    public Iterable<YearUpStudent> getAllYearUpStudents(){
        return yearUpStudentRepository.findAll();
    }

    public YearUpStudent createYearUpStudent(YearUpStudent yearUpStudent){
        return yearUpStudentRepository.save(yearUpStudent);
    }

    public YearUpStudent updateYearUpStudent(YearUpStudent yearUpStudent, Long id){
        yearUpStudentRepository.findById(id);
        return yearUpStudentRepository.save(yearUpStudent);
    }

    public void deleteYearUpStudent(Long id){
         yearUpStudentRepository.deleteById(id);
    }

    public void uploadPicture(MultipartFile multipartFile, Long id){
        YearUpStudent yearUpStudent = getYearUpStudentByID(id).get();
        yearUpStudent.setPicture(fileService.uploadPicture(multipartFile, yearUpStudent));
        updateYearUpStudent(yearUpStudent, id);
    }

    public void uploadResume(MultipartFile multipartFile, Long id){
        YearUpStudent yearUpStudent = getYearUpStudentByID(id).get();
        yearUpStudent.setResume(fileService.uploadResume(multipartFile, yearUpStudent));
        updateYearUpStudent(yearUpStudent, id);
    }



}
