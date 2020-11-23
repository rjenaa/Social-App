package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

    @Id
    private Long id;
    private String username;


    //private String userName;
}
