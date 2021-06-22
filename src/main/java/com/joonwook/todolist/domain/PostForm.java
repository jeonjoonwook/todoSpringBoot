package com.joonwook.todolist.domain;


public class PostForm {
    private int id;
    private String content;

    public PostForm(int id, String content)
    {
        this.id = id;
        this.content = content;
    }
    public PostForm(){}

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
