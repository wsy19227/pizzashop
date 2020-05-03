package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Snack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer snack_id;
    private String snack_name;
    private String snack_img;
    private Double snack_price;

    public Snack() {
    }

    public Snack(String snack_name, String snack_img, Double snack_price) {
        this.snack_name = snack_name;
        this.snack_img = snack_img;
        this.snack_price = snack_price;
    }

    public Integer getSnack_id() {
        return snack_id;
    }

    public void setSnack_id(Integer snack_id) {
        this.snack_id = snack_id;
    }

    public String getSnack_name() {
        return snack_name;
    }

    public void setSnack_name(String snack_name) {
        this.snack_name = snack_name;
    }

    public String getSnack_img() {
        return snack_img;
    }

    public void setSnack_img(String snack_img) {
        this.snack_img = snack_img;
    }

    public Double getSnack_price() {
        return snack_price;
    }

    public void setSnack_price(Double snack_price) {
        this.snack_price = snack_price;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "snack_id=" + snack_id +
                ", snack_name='" + snack_name + '\'' +
                ", snack_img='" + snack_img + '\'' +
                ", snack_price=" + snack_price +
                '}';
    }
}
