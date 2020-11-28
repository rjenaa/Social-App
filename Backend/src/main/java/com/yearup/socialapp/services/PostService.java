package com.yearup.socialapp.services;

import com.yearup.socialapp.models.Post;
import com.yearup.socialapp.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Optional<Post> getPostById(Long id){
        return postRepository.findById(id);
    }

    public Iterable<Post> getAllPostByAccountId(Long id){
        return postRepository.findAllByAccountId(id);
    }

    public Iterable<Post> getAllPost(){
        return postRepository.findAll();
    }

    public Iterable<Post> getPostByLikes(Long likes){


        return postRepository.findAllByRank(likes);
    }

    public Post createPost(Post post){
        return postRepository.save(post);
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }

    public Post updatePost(Post post, Long id){
        postRepository.findById(id);
        return postRepository.save(post);
    }
}
