package com.example.pizzashop.action;

import com.example.pizzashop.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/goods")
public class GoodsAction {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/hot.do")
    public String toHotPage(Map<String,Object> map){
        map.put("pizza", goodsService.getAllPizza());
        //System.out.println(goodsService.getAllPizza());
        return "hot";
    }
    @RequestMapping("/set_meal.do")
    public String toSetMealPage(Map<String,Object> map){
        map.put("set_meal", goodsService.getAllSetMeal());
        //System.out.println(goodsService.getAllPizza());
        return "set_meal";
    }

    @RequestMapping("/season.do")
    public String toSeason(Map<String,Object> map){
        map.put("season",goodsService.getAllPizza());
        return "season";
    }
    @RequestMapping("/snack.do")
    public String toPot(Map<String,Object> map){
        map.put("snack",goodsService.getAllSnack());
        return "snack";
    }
    @RequestMapping("/drink.do")
    public String toDrink(Map<String,Object> map){
        map.put("drink",goodsService.getAllDrink());
        return "drink";
    }

}
