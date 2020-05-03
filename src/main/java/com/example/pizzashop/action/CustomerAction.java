package com.example.pizzashop.action;

import com.example.pizzashop.entity.Customer;
import com.example.pizzashop.service.CustomerService;
import com.example.pizzashop.service.GoodsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/customer")
public class CustomerAction {

    @Autowired
    CustomerService customerService;
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/to_order.do")
    public String toOrderPage(){
        return "order";
    }

    @RequestMapping("/to_login.do")
    public String toLoginPage(){
        return "customer_login";
    }

    @RequestMapping("/to_collect.do/{customer_id}")
    public String toCollectPage(Map<String,Object> map, @PathVariable("customer_id") String customer_id){
        System.out.println("***********"+customer_id);
        if(customer_id==null)
            return "login_error";
        Integer id=Integer.valueOf(customer_id);
        System.out.println(customer_id);
        map.put("collect_list",goodsService.getCollectByCustomerId(id));
        return "collect";
    }

    @RequestMapping("/login.do")
    public String login(@RequestParam("account") String account, @Param("pwd") String pwd, HttpServletRequest request){
        Customer customer=customerService.login(account,pwd);
        HttpSession session=request.getSession();
        session.setAttribute("customer", customer);
        return "customer_index";
    }
}
