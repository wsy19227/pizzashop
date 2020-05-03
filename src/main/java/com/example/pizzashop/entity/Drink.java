package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer drink_id;
    private String drink_name;
    private String drink_img;
    private Double drink_price;

    public Drink(String drink_name, String drink_img, Double drink_price) {
        this.drink_name = drink_name;
        this.drink_img = drink_img;
        this.drink_price = drink_price;
    }

    public Drink() {
    }

    public Integer getDrink_id() {
        return drink_id;
    }

    public void setDrink_id(Integer drink_id) {
        this.drink_id = drink_id;
    }

    public String getDrink_name() {
        return drink_name;
    }

    public void setDrink_name(String drink_name) {
        this.drink_name = drink_name;
    }

    public String getDrink_img() {
        return drink_img;
    }

    public void setDrink_img(String drink_img) {
        this.drink_img = drink_img;
    }

    public Double getDrink_price() {
        return drink_price;
    }

    public void setDrink_price(Double drink_price) {
        this.drink_price = drink_price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drink_id=" + drink_id +
                ", drink_name='" + drink_name + '\'' +
                ", drink_img='" + drink_img + '\'' +
                ", drink_price=" + drink_price +
                '}';
    }
}
