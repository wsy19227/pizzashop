package com.example.pizzashop.args;

import com.example.pizzashop.entity.Drink;
import com.example.pizzashop.entity.Pizza;
import com.example.pizzashop.entity.SetMeal;
import com.example.pizzashop.entity.Snack;

public class CollectArgs {

    private Pizza pizza;
    private Drink drink;
    private Snack snack;
    private SetMeal setMeal;

    public CollectArgs(Pizza pizza, Drink drink, Snack snack, SetMeal setMeal) {
        this.pizza = pizza;
        this.drink = drink;
        this.snack = snack;
        this.setMeal = setMeal;
    }

    public CollectArgs() {
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public SetMeal getSetMeal() {
        return setMeal;
    }

    public void setSetMeal(SetMeal setMeal) {
        this.setMeal = setMeal;
    }

    @Override
    public String toString() {
        return "CollectArgs{" +
                "pizza=" + pizza +
                ", drink=" + drink +
                ", snack=" + snack +
                ", setMeal=" + setMeal +
                '}';
    }


    /*private String pizza_img;
    private String pizza_name;
    private Double pizza_price;
    private String pizza_size;
    private String drink_name;
    private String drink_img;
    private Double drink_price;
    private String set_meal_name;
    private String set_meal_img;
    private Double set_meal_price;
    private String snack_name;
    private String snack_img;
    private Double snack_price;

    public CollectArgs() {
    }

    public CollectArgs(String pizza_img, String pizza_name, Double pizza_price, String pizza_size, String drink_name, String drink_img, Double drink_price, String set_meal_name, String set_meal_img, Double set_meal_price, String snack_name, String snack_img, Double snack_price) {
        this.pizza_img = pizza_img;
        this.pizza_name = pizza_name;
        this.pizza_price = pizza_price;
        this.pizza_size = pizza_size;
        this.drink_name = drink_name;
        this.drink_img = drink_img;
        this.drink_price = drink_price;
        this.set_meal_name = set_meal_name;
        this.set_meal_img = set_meal_img;
        this.set_meal_price = set_meal_price;
        this.snack_name = snack_name;
        this.snack_img = snack_img;
        this.snack_price = snack_price;
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
        return "CollectArgs{" +
                "pizza_img='" + pizza_img + '\'' +
                ", pizza_name='" + pizza_name + '\'' +
                ", pizza_price=" + pizza_price +
                ", pizza_size='" + pizza_size + '\'' +
                ", drink_name='" + drink_name + '\'' +
                ", drink_img='" + drink_img + '\'' +
                ", drink_price=" + drink_price +
                ", set_meal_name='" + set_meal_name + '\'' +
                ", set_meal_img='" + set_meal_img + '\'' +
                ", set_meal_price=" + set_meal_price +
                ", snack_name='" + snack_name + '\'' +
                ", snack_img='" + snack_img + '\'' +
                ", snack_price=" + snack_price +
                '}';
    }*/
}
