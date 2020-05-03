package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collect {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer collect_id;
    private Integer customer_id;
    private Integer pizza_id;
    private Integer drink_id;
    private Integer snack_id;
    private Integer set_meal_id;

    public Collect() {
    }

    public Collect(Integer customer_id, Integer pizza_id, Integer drink_id, Integer snack_id, Integer set_meal_id) {
        this.customer_id = customer_id;
        this.pizza_id = pizza_id;
        this.drink_id = drink_id;
        this.snack_id = snack_id;
        this.set_meal_id = set_meal_id;
    }

    public Integer getCollect_id() {
        return collect_id;
    }

    public void setCollect_id(Integer collect_id) {
        this.collect_id = collect_id;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public Integer getPizza_id() {
        return pizza_id;
    }

    public void setPizza_id(Integer pizza_id) {
        this.pizza_id = pizza_id;
    }

    public Integer getDrink_id() {
        return drink_id;
    }

    public void setDrink_id(Integer drink_id) {
        this.drink_id = drink_id;
    }

    public Integer getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(Integer snack_id) {
        this.snack_id = snack_id;
    }

    public Integer getSet_meal_id() {
        return set_meal_id;
    }

    public void setSet_meal_id(Integer set_meal_id) {
        this.set_meal_id = set_meal_id;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collect_id=" + collect_id +
                ", customer_id=" + customer_id +
                ", pizza_id=" + pizza_id +
                ", drink_id=" + drink_id +
                ", snack_id=" + snack_id +
                ", set_meal_id=" + set_meal_id +
                '}';
    }
}
