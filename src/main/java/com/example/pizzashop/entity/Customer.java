package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private String customer_account;
    private String customer_name;
    private String customer_pwd;
    private String customer_telephone;
    private String customer_address;

    public Customer() {
    }

    public Customer(String customer_account, String customer_name, String customer_pwd, String customer_telephone, String customer_address) {
        this.customer_account = customer_account;
        this.customer_name = customer_name;
        this.customer_pwd = customer_pwd;
        this.customer_telephone = customer_telephone;
        this.customer_address = customer_address;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_account() {
        return customer_account;
    }

    public void setCustomer_account(String customer_account) {
        this.customer_account = customer_account;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_pwd() {
        return customer_pwd;
    }

    public void setCustomer_pwd(String customer_pwd) {
        this.customer_pwd = customer_pwd;
    }

    public String getCustomer_telephone() {
        return customer_telephone;
    }

    public void setCustomer_telephone(String customer_telephone) {
        this.customer_telephone = customer_telephone;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_account='" + customer_account + '\'' +
                ", customer_name='" + customer_name + '\'' +
                ", customer_pwd='" + customer_pwd + '\'' +
                ", customer_telephone='" + customer_telephone + '\'' +
                ", customer_address='" + customer_address + '\'' +
                '}';
    }
}