package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    {posts.add(new Post(0l,"Post1",new Date()));
    posts.add(new Post(1l,"Post2",new Date()));
    posts.add(new Post(2l,"Post3",new Date()));}
    public List<Post> listAllPosts()
    {
        return posts;
    }
    public void create(String text) {
        posts.add(new Post((long)posts.size(),text, new Date()));
    }
}
