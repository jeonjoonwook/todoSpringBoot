package com.joonwook.todolist.repository;

import com.joonwook.todolist.domain.PostForm;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    int save(PostForm postForm);
    List<PostForm> findAll();
    Optional<PostForm> findById(int id);
    Optional<PostForm> findByContent(String content);

}
