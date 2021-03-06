package com.yearup.socialapp.repositories;

import com.yearup.socialapp.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByAccountId (Long accountId);
    Optional<Post> findById(Long id);
}
