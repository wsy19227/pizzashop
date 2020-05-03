package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SetMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer set_meal_id;
    private String set_meal_name;
    private String set_meal_img;
    private Double set_meal_price;

    public SetMeal(String set_meal_name, String set_meal_img, Double set_meal_price) {
        this.set_meal_name = set_meal_name;
        this.set_meal_img = set_meal_img;
        this.set_meal_price = set_meal_price;
    }

    public SetMeal() {
    }

    public Integer getSet_meal_id() {
        return set_meal_id;
    }

    public void setSet_meal_id(Integer set_meal_id) {
        this.set_meal_id = set_meal_id;
    }

    public String getSet_meal_name() {
        return set_meal_name;
    }

    public void setSet_meal_name(String set_meal_name) {
        this.set_meal_name = set_meal_name;
    }

    public String getSet_meal_img() {
        return set_meal_img;
    }

    public void setSet_meal_img(String set_meal_img) {
        this.set_meal_img = set_meal_img;
    }

    public Double getSet_meal_price() {
        return set_meal_price;
    }

    public void setSet_meal_price(Double set_meal_price) {
        this.set_meal_price = set_meal_price;
    }

    @Override
    public String toString() {
        return "SetMeal{" +
                "set_meal_id=" + set_meal_id +
                ", set_meal_name='" + set_meal_name + '\'' +
                ", set_meal_img='" + set_meal_img + '\'' +
                ", set_meal_price=" + set_meal_price +
                '}';
    }
}
