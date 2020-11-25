package com.yearup.socialapp.services;

import com.yearup.socialapp.repositories.ResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourcesService {

    @Autowired
    ResourcesRepository resourcesRepository;
}
