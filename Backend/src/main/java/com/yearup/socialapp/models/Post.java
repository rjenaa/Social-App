package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId;
    private String message;
    private Long Likes;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getLikes() {
        return Likes;
    }

    public void setLikes(Long likes) {
        Likes = likes;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", message='" + message + '\'' +
                ", Likes=" + Likes +
                '}';
    }
}
