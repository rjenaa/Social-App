package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.Resources;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResourcesRepository extends CrudRepository<Resources, Long> {

    Optional<Resources> findResourceById (Long id);//Get all resources from all users that have been posted.

    Iterable<Resources> findAllByRank(Integer rank);

    Iterable<Resources> findAllByAccountId(Long id);
}
