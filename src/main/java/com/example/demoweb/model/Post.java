package com.example.demoweb.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    private String text;
    private Date creationDate;
    private Integer likes = 0;

    @Id
    @GeneratedValue
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

    public Post() {
    }

    public Post(Long id, String text, Date creationDate) {
        this.text = text;
        this.creationDate = creationDate;
        this.id = id;
    }
}
