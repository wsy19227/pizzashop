package com.example.pizzashop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_id;
    private String member_name;
    private Integer member_age;
    private String member_sex;
    private Integer member_integral;

    public MemberShip() {
    }

    public MemberShip(String member_name, Integer member_age, String member_sex, Integer member_integral) {
        this.member_name = member_name;
        this.member_age = member_age;
        this.member_sex = member_sex;
        this.member_integral = member_integral;
    }

    public Integer getMember_id() {
        return member_id;
    }

    public void setMember_id(Integer member_id) {
        this.member_id = member_id;
    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public Integer getMember_age() {
        return member_age;
    }

    public void setMember_age(Integer member_age) {
        this.member_age = member_age;
    }

    public String getMember_sex() {
        return member_sex;
    }

    public void setMember_sex(String member_sex) {
        this.member_sex = member_sex;
    }

    public Integer getMember_integral() {
        return member_integral;
    }

    public void setMember_integral(Integer member_integral) {
        this.member_integral = member_integral;
    }

    @Override
    public String toString() {
        return "MemberShip{" +
                "member_id=" + member_id +
                ", member_name='" + member_name + '\'' +
                ", member_age=" + member_age +
                ", member_sex='" + member_sex + '\'' +
                ", member_integral=" + member_integral +
                '}';
    }
}
