package com.joonwook.todolist.controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //{id:1, title:'iPad Mini', price:500.5, inventory:7},
    //{id:2, title:'iPad Pro', price:800.4, inventory:5},
    //{id:3, title:'MacBook', price:1200.6, inventory:2}
    private int id;
    private String title;
    private long price;
    private int inventory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
