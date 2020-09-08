package com.example.demoweb.model;


import java.util.Date;

public class Post {

    private String text;
    private Date creationDate;
    private Integer likes = 0;
    private Long id;

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Long getId() {
        return id;
    }

    public Post(Long id, String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }
}
