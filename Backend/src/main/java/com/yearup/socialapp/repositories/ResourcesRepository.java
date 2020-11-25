package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.Resources;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourcesRepository extends CrudRepository<Resources, Long> {

    Iterable<Resources> findAllByAccountId (Long accountId);
}
