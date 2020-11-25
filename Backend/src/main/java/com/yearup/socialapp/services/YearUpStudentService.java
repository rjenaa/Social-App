package com.yearup.socialapp.services;

import com.yearup.socialapp.models.YearUpStudent;
import com.yearup.socialapp.repositories.YearUpStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YearUpStudentService {

    @Autowired
    YearUpStudentRepository yearUpStudentRepository;

    @Autowired
    AccountService accountService;


}
