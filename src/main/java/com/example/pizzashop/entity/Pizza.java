package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pizza_id;
    private String pizza_img;
    private String pizza_name;
    private Double pizza_price;
    private String pizza_size;

    public Pizza() {
    }

    public Pizza(String pizza_img, String pizza_name, Double pizza_price, String pizza_size) {
        this.pizza_img = pizza_img;
        this.pizza_name = pizza_name;
        this.pizza_price = pizza_price;
        this.pizza_size = pizza_size;
    }

    public Integer getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(Integer pizza_id) {
        this.pizza_id = pizza_id;
    }

    public String getPizza_img() {
        return pizza_img;
    }

    public void setPizza_img(String pizza_img) {
        this.pizza_img = pizza_img;
    }

    public String getPizza_name() {
        return pizza_name;
    }

    public void setPizza_name(String pizza_name) {
        this.pizza_name = pizza_name;
    }

    public Double getPizza_price() {
        return pizza_price;
    }

    public void setPizza_price(Double pizza_price) {
        this.pizza_price = pizza_price;
    }

    public String getPizza_size() {
        return pizza_size;
    }

    public void setPizza_size(String pizza_size) {
        this.pizza_size = pizza_size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizza_id=" + pizza_id +
                ", pizza_img='" + pizza_img + '\'' +
                ", pizza_name='" + pizza_name + '\'' +
                ", pizza_price=" + pizza_price +
                ", pizza_size='" + pizza_size + '\'' +
                '}';
    }
}
