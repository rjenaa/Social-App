package com.yearup.socialapp.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.yearup.socialapp.AWS.FileService;
import com.yearup.socialapp.models.Post;
import com.yearup.socialapp.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PostController {

    @Autowired
    PostService postService;

    @Autowired
    FileService fileService;

    @RequestMapping (value = "/post", method = RequestMethod.GET)
    public Iterable<Post> getAllPost(){
        return postService.getAllPost();
    }

    @RequestMapping (value = "/post/{id}", method = RequestMethod.GET)
    public Optional<Post> getPostById(@PathVariable Long id){
        return postService.getPostById(id);
    }

    @RequestMapping (value = "/post/{accountId}", method = RequestMethod.GET)
    public Iterable<Post> getAllPostByAccountId(@PathVariable Long accountId){
        return postService.getAllPostByAccountId(accountId);
    }

    @RequestMapping (value = "/{accountId}/post", method = RequestMethod.POST)
    public Post createPost(@RequestBody Post post){
        return postService.createPost(post);
    }

    @RequestMapping (value = "/post/{id}", method = RequestMethod.PUT)
    public Post updatePostById(@PathVariable Long id, @RequestBody Post post){
        return postService.updatePost(post, id);
    }

    @RequestMapping (value = "/post/{id}", method = RequestMethod.DELETE)
    public void deletePost(@PathVariable Long id){
        postService.deletePost(id);
    }

}
