package com.joonwook.todolist.service;

import com.joonwook.todolist.domain.PostForm;
import com.joonwook.todolist.repository.PostRepository;

import java.util.List;

public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public int postTodo(PostForm postForm){
        return postRepository.save(postForm);
    }

    public List<PostForm> findPosts(){
        return postRepository.findAll();
    }
}
