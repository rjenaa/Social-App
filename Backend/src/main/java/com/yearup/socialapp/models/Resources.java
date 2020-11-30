package com.yearup.socialapp.models;

import javax.persistence.*;

@Entity
public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String URL;
    private Long accountId;
    private Integer helpful;
    private Integer notHelpful;
    @OneToOne(cascade = CascadeType.ALL)
    private Resume resume;

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

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "id=" + id +
                ", URL='" + URL + '\'' +
                ", accountId=" + accountId +
                ", helpful=" + helpful +
                ", notHelpful=" + notHelpful +
                ", resume=" + resume +
                '}';
    }
}
