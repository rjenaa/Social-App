package com.yearup.socialapp.models;

import java.io.File;

public class Resources {

    private String URL;
    private Long AccountID;
    private Integer Helpful;
    private Integer NotHelpful;
    private Integer Rank;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Integer getHelpful() {
        return Helpful;
    }

    public void setHelpful(Integer helpful) {
        Helpful = helpful;
    }

    public Integer getNotHelpful() {
        return NotHelpful;
    }

    public void setNotHelpful(Integer notHelpful) {
        NotHelpful = notHelpful;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public Long getAccountID() {
        return AccountID;
    }

    public void setAccountID(Long accountID) {
        AccountID = accountID;
    }

    @Override
    public String toString() {
        return "Resources{" +
                "URL='" + URL + '\'' +
                ", AccountID=" + AccountID +
                ", Helpful=" + Helpful +
                ", NotHelpful=" + NotHelpful +
                ", Rank=" + Rank +
                '}';
    }
}
