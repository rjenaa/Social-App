package com.yearup.socialapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String URL;
    private Long accountId;
    private Integer helpful;
    private Integer notHelpful;

    public Resources() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Integer getHelpful() {
        return helpful;
    }

    public void setHelpful(Integer helpful) {
        this.helpful = helpful;
    }

    public Integer getNotHelpful() {
        return notHelpful;
    }

    public void setNotHelpful(Integer notHelpful) {
        this.notHelpful = notHelpful;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "id=" + id +
                ", URL='" + URL + '\'' +
                ", accountId=" + accountId +
                ", helpful=" + helpful +
                ", notHelpful=" + notHelpful +
                '}';
    }
}
