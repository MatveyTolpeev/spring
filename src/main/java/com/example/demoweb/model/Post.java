package com.example.demoweb.model;


import java.util.Date;

public class Post {

    private String text;
    private Date creationDate;
    private Integer likes = 0;

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Post(String text,Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
    }
}
