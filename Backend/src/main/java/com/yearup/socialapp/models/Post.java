package com.yearup.socialapp.models;

import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long accountId;
    private String message;
    private Long likes;

    @OneToOne(cascade = CascadeType.ALL)
    private Picture picture;

    public Post() {
    }

    public Post(Long id, Long likes) {
        this.id = id;
        this.likes = likes;
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
        return likes;
    }

    public void setLikes(Long likes) {
        this.likes = likes;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", message='" + message + '\'' +
                ", likes=" + likes +
                ", picture=" + picture +
                '}';
    }
}
