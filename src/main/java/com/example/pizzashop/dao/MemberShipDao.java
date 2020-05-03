package com.example.pizzashop.dao;

import com.example.pizzashop.entity.MemberShip;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberShipDao {
    @Insert("insert into member_ship(member_name,member_age,member_sex,member_integral) values(#{member_name},#{member_age},#{member_sex},#{member_integral})")
    public void insert(MemberShip memberShip);

}
