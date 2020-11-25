package com.yearup.socialapp.controllers;

import com.yearup.socialapp.AWS.FileService;
import com.yearup.socialapp.models.YearUpStudent;
import com.yearup.socialapp.services.YearUpStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
public class YearUpStudentController {

    @Autowired
    YearUpStudentService yearUpStudentService;

    @Autowired
    FileService fileService;

    @RequestMapping(value ="/YearUpStudents", method = RequestMethod.GET)
    public Iterable<YearUpStudent> getAllYearUpStudents(){ return yearUpStudentService.getAllYearUpStudents();}

    @RequestMapping(value ="/YearUpStudents/{id}", method = RequestMethod.GET)
    public Optional<YearUpStudent> getYearUpStudentsById(@PathVariable Long id){ return yearUpStudentService.getYearUpStudentByID(id);}

    @RequestMapping(value ="/YearUpStudents/fname", method = RequestMethod.GET)
    public Optional<YearUpStudent> getYearUpStudentByFirstName(@RequestParam String name){ return yearUpStudentService.getYearUpStudentByFirstName(name);}

    @RequestMapping(value ="/YearUpStudents/lname", method = RequestMethod.GET)
    public Optional<YearUpStudent> getYearUpStudentByLastName(@RequestParam String name){ return yearUpStudentService.getYearUpStudentByLastName(name);}

    @RequestMapping(value ="/YearUpStudents/account/{id}", method = RequestMethod.GET)
    public Optional<YearUpStudent> getYearUpStudentByAccountId(@PathVariable Long id){ return yearUpStudentService.getYearUpStudentByAccountID(id);}

    @RequestMapping(value ="/YearUpStudents", method = RequestMethod.POST)
    public YearUpStudent createYearUpStudent(@RequestBody YearUpStudent yearUpStudent){ return yearUpStudentService.createYearUpStudent(yearUpStudent);}

    @RequestMapping(value ="/YearUpStudents/{id}", method = RequestMethod.PUT)
    public YearUpStudent updateYearUpStudent(@PathVariable Long id, @RequestBody YearUpStudent yearUpStudent){ return yearUpStudentService.updateYearUpStudent(yearUpStudent, id);}

    @RequestMapping(value ="/YearUpStudents/{id}", method = RequestMethod.DELETE)
    public void deleteYearUpStudent(@PathVariable Long id){ yearUpStudentService.deleteYearUpStudent(id);}

    @PostMapping(value= "/upload/{id}")
    public ResponseEntity<String> uploadFile(@RequestParam(value= "file") final MultipartFile multipartFile, @PathVariable Long id) {
        YearUpStudent yearUpStudent = yearUpStudentService.getYearUpStudentByID(id).get();
        fileService.uploadFile(multipartFile, yearUpStudent);
        final String response = "[" + multipartFile.getOriginalFilename() + "] uploaded successfully.";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
