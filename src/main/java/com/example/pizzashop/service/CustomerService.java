package com.example.pizzashop.service;

import com.example.pizzashop.dao.CustomerDao;
import com.example.pizzashop.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;
    public void addCustomer(Customer customer) {
        customerDao.insert(customer);
    }

    public Customer getCustomerByName(String name){
        return customerDao.getCustomerByName(name);
    }

    public Customer login(String account,String pwd){
        return customerDao.getCustomerByAccountAndPwd(account,pwd);
    }
}
