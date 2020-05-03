package com.example.pizzashop.dao;

import com.example.pizzashop.entity.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GoodsDao {
    @Select("select * from pizza")
    public List<Pizza> getAllPizza();
    @Select("select * from set_meal")
    public List<SetMeal> getAllSetMeal();
    @Select("select * from drink")
    public List<Drink> getAllDrink();
    @Select("select * from snack")
    public List<Snack> getAllSnack();
    @Select("select * from collect where customer_id=#{customer_id}")
    public List<Collect> getCollectById(Integer customer_id);

    @Select("select * from pizza where pizza_id=#{pizza_id}")
    public Pizza getCollectPizzaById(@Param("pizza_id")Integer pizza_id);

    @Select("select * from drink where drink_id=#{drink_id}")
    public Drink getCollectDrinkById(@Param("drink_id")Integer drink_id);

    @Select("select * from snack where snack_id=#{snack_id}")
    public Snack getCollectSnackById(@Param("snack_id")Integer snack_id);

    @Select("select * from set_meal where set_meal_id=#{set_meal_id}")
    public SetMeal getCollectSetMealById(@Param("set_meal_id")Integer set_meal_id);
}
