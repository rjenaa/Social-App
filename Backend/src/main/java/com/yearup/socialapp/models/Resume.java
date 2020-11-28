package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String URL;

    public Resume() {
    }

    public Long getId() {
        return id;
    }

    public String getURL() {
        return URL;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", URL='" + URL + '\'' +
                '}';
    }
}
