package com.yearup.socialapp.services;

import com.yearup.socialapp.models.Resources;
import com.yearup.socialapp.repositories.ResourcesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ResourcesService {

    @Autowired
    ResourcesRepository resourcesRepository;

    public Optional<Resources> getResourceById(Long id){
        return resourcesRepository.findById(id);
    }

    public Iterable<Resources> getAllResources(){
        return resourcesRepository.findAll();
    }

    public Iterable<Resources> getAllResourcesByAccountId(Long accountId){
        return resourcesRepository.findAllByAccountId(accountId);
    }

//    public Iterable<Resources> getMostLikedResourceByRank(Integer rank){
//        return resourcesRepository.findAllByRank(rank);
//    }
}
