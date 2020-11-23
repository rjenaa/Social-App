package com.yearup.socialapp.models;

public class Post {


    private Long ID;
    private Long AccountID;
    private String message;
    private Integer Rank;



    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        return "Post{" +
                "ID=" + ID +
                ", AccountID=" + AccountID +
                ", message='" + message + '\'' +
                ", Rank=" + Rank +
                '}';
    }
}
