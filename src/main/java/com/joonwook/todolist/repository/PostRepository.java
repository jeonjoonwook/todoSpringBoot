package com.joonwook.todolist.repository;

import com.joonwook.todolist.domain.PostForm;

import java.util.List;

public interface PostRepository {
    int save(PostForm postForm);
    List<PostForm> findAll();
}
