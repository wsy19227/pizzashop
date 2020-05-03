package com.example.pizzashop.service;

import com.example.pizzashop.args.CollectArgs;
import com.example.pizzashop.entity.*;
import com.example.pizzashop.dao.GoodsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsDao goodsDao;
    public List<Pizza> getAllPizza(){
        System.out.println(goodsDao.getAllPizza());
        return goodsDao.getAllPizza();
    }

    public List<SetMeal> getAllSetMeal(){
        return goodsDao.getAllSetMeal();
    }

    public List<Drink> getAllDrink(){
        return goodsDao.getAllDrink();
    }

    public List<Snack> getAllSnack(){
        return goodsDao.getAllSnack();
    }

    public List<CollectArgs> getCollectByCustomerId(Integer id){
        List<Collect> list=goodsDao.getCollectById(id);
        List<CollectArgs> collectArgsList=new ArrayList<CollectArgs>();
        for(Collect c:list){
           CollectArgs collectArgs=new CollectArgs(goodsDao.getCollectPizzaById(c.getPizza_id()),goodsDao.getCollectDrinkById(c.getDrink_id()),goodsDao.getCollectSnackById(c.getSnack_id()),goodsDao.getCollectSetMealById(c.getSet_meal_id()));
           collectArgsList.add(collectArgs);
        }
        return collectArgsList;
    }
}
