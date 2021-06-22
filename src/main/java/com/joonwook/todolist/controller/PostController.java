package com.joonwook.todolist.controller;

import com.joonwook.todolist.domain.PostForm;
import com.joonwook.todolist.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/posts/new")
    public String createForm(){
        return "posts/createPostForm";
    }

    @PostMapping("/posts/new")
    public String create(PostForm form){
        PostForm post = new PostForm();

        post.setContent(form.getContent());
        postService.postTodo(post);
        return "redirect:/";
    }

    @GetMapping("posts")
    public String list(Model model){
        List<PostForm> postList = postService.findPosts();
        model.addAttribute("postList",postList);
        return "posts/postList";
    }

}
