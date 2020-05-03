package com.example.pizzashop.action;

import com.example.pizzashop.args.UserArgs;
import com.example.pizzashop.entity.Customer;
import com.example.pizzashop.entity.MemberShip;
import com.example.pizzashop.service.CustomerService;
import com.example.pizzashop.service.MemberShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/membership")
public class MemberShipAction {
    @Autowired
    MemberShipService memberShipService;
    @Autowired
    CustomerService customerService;

    @RequestMapping("/tomembership_agree.do")
    public String toMemberShip(){
        return "membership_service_agreement";
    }

    @RequestMapping("/show_to_member.do")
    public String showToMemberShip(){
        return "to_member";
    }

    @RequestMapping("/show_register_member.do")
    public String showRegisMemberShip(){
        return "register_member";
    }

   @RequestMapping("/register_member.do")
    public String register(UserArgs userArgs,Model model){
        Customer customer=new Customer(userArgs.getCustomerAccount(), userArgs.getCustomerName(), userArgs.getCustomerPwd(),userArgs.getCustomerTelephone(),userArgs.getCustomerAddress());
        MemberShip memberShip=new MemberShip(userArgs.getCustomerName(), userArgs.getMemberAge(),userArgs.getMemberSex(), 0);
        System.out.println(customer);
        System.out.println(memberShip);
        memberShipService.addMember(memberShip);
        customerService.addCustomer(customer);
        model.addAttribute("customer", customer);
        model.addAttribute("member", memberShip);
        return "member_detail";
    }

    @RequestMapping("/to_member.do")
    public String toBeMember(@RequestParam("name") String name,@RequestParam("age") Integer age,@RequestParam("sex") String sex, Model model){
        MemberShip memberShip=new MemberShip(name,age,sex,0);
        System.out.println(memberShip);
        memberShipService.addMember(memberShip);
        model.addAttribute("customer", customerService.getCustomerByName(name));
        model.addAttribute("member", memberShip);
        return "member_detail";
    }
}
