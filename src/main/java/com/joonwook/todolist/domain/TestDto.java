package com.joonwook.todolist.domain;

public class TestDto {
    //{id:1, title:'iPad Mini', price:500.5, inventory:7},
    //{id:2, title:'iPad Pro', price:800.4, inventory:5},
    //{id:3, title:'MacBook', price:1200.6, inventory:2}
    private int id;
    private String title;
    private double price;
    private int inventory;

    public TestDto(int id, String title, double price, int inventory) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.inventory = inventory;
    }



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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
