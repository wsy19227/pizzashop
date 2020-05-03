package com.example.pizzashop.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageAction {


    @RequestMapping("/pizza_culture_page.do")
    public String toPizzaCulturePage(){
        return "pizza_culture";
    }
    @RequestMapping("/join_us.do")
    public String joinUs(){
        return "join_us";
    }
}
