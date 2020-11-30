package com.yearup.socialapp.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.yearup.socialapp.AWS.FileService;
import com.yearup.socialapp.models.Resources;
import com.yearup.socialapp.models.YearUpStudent;
import com.yearup.socialapp.services.ResourcesService;
import com.yearup.socialapp.services.YearUpStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ResourcesController {

    @Autowired
    ResourcesService resourcesService;

    @Autowired
    YearUpStudentService yearUpStudentService;

    @Autowired
    FileService fileService;

    @RequestMapping (value = "/resource/{id}", method = RequestMethod.GET)//get resource by id
    public Optional<Resources> getResourceById (@PathVariable Long id){
        return resourcesService.getResourceById(id);
    }

    @RequestMapping (value = "/resources/{accountId}", method = RequestMethod.GET)//get all resource by account id
    public Iterable<Resources> getAllResourcesByAccountId(@PathVariable Long accountId){
        return resourcesService.getAllResourcesByAccountId(accountId);
    }

    @RequestMapping (value = "/resources", method = RequestMethod.GET)//Get all resources
    public Iterable<Resources> getAllResources(){
        return resourcesService.getAllResources();
    }

//    @RequestMapping (value = "/resources/{id}/{ranked}", method = RequestMethod.GET)//Get best resources
//    public Iterable<Resources> getBestResources(@PathVariable Long id, @PathVariable Integer ranked){
//        return resourcesService.getMostLikedResourceByRank(ranked);
//    }

    @RequestMapping(value = "/resource", method = RequestMethod.POST)
    public Resources createResource(@RequestBody Resources resource){
        return resourcesService.createResource(resource);
    }

    @PostMapping (value = "/upload/resource/{accountId}/{id}")//Creating a resource
    public ResponseEntity<String> uploadFile(@RequestParam(value = "file") final MultipartFile multipartFile, @PathVariable Long accountId, @PathVariable Long id){
        Resources resources = resourcesService.getResourceById(id).get();
        YearUpStudent yearUpStudent = yearUpStudentService.getYearUpStudentByAccountID(accountId).get();
        fileService.uploadResume(multipartFile, yearUpStudent);

        final String response = "[" + multipartFile.getOriginalFilename() + "] uploaded successfully.";
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
