package com.example.pizzashop.service;

import com.example.pizzashop.dao.CustomerDao;
import com.example.pizzashop.dao.MemberShipDao;
import com.example.pizzashop.entity.MemberShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberShipService {
    @Autowired
    MemberShipDao memberShipDao;
    @Autowired
    CustomerDao customerDao;
    //注册会员
    public void addMember(MemberShip memberShip){
        memberShipDao.insert(memberShip);
    }
}
