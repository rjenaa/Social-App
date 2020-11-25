package com.yearup.socialapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Resources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rank;

    private String URL;
    private Long accountId;
    private Integer helpful;
    private Integer notHelpful;

    public Resources() {
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

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
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
                "URL='" + URL + '\'' +
                ", AccountID=" + accountId +
                ", Helpful=" + helpful +
                ", NotHelpful=" + notHelpful +
                ", Rank=" + rank +
                '}';
    }
}
