package com.joonwook.todolist.controller;

import com.joonwook.todolist.domain.PostForm;
import com.joonwook.todolist.domain.TestDto;
import com.joonwook.todolist.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }
    /*
    @GetMapping("/")
    public String home(){
        return "home";
    }
    */
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
    /*
    @RequestMapping(value="/test", method= RequestMethod.GET)
    public ModelAndView test(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("message", "Home...");
        mav.setViewName("test");
        return mav;
    }
    */

    @GetMapping("/test")
    @ResponseBody
    public List<TestDto> test(){
        List<TestDto> testDtoList = new ArrayList<>();
        testDtoList.add(new TestDto(1,"iPad Mini",500.5,7));
        testDtoList.add(new TestDto(2,"iPad Pro",800.4,5));
        testDtoList.add(new TestDto(3,"MacBook",1200.6,2));

        //{id:1, title:'iPad Mini', price:500.5, inventory:7},
        //{id:2, title:'iPad Pro', price:800.4, inventory:5},
        //{id:3, title:'MacBook', price:1200.6, inventory:2}
        return testDtoList;
    }


    @RequestMapping(value="/data", method=RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> data(@RequestParam(name="msg") String msg) {
        System.out.println(msg);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "Server message with " + msg);
        return map;
    }

}
