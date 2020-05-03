package com.example.pizzashop.dao;

import com.example.pizzashop.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CustomerDao {
    @Insert("insert into customer(customer_account,customer_name,customer_pwd,customer_telephone,customer_address) values(#{customer_account},#{customer_name},#{customer_pwd},#{customer_telephone},#{customer_address})")
    public void insert(Customer customer);
    @Select("select * from customer where customer_name=#{customer_name}")
    public Customer getCustomerByName(@Param("customer_name") String customer_name);
    @Select("select * from customer where customer_account=#{customer_account} and customer_pwd=#{customer_pwd}")
    public Customer getCustomerByAccountAndPwd(@Param("customer_account") String customer_account,@Param("customer_pwd") String customer_pwd);
}
