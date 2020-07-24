package com.spring.thirdjdbcApp.repository;


import com.spring.thirdjdbcApp.mapper.HomeMapper;
import com.spring.thirdjdbcApp.model.Home;
import com.spring.thirdjdbcApp.model.Home1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HomeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addToHome(Home home){

        String query = "insert into home(name,mail,addr) values(?,?,?)";

        int i = jdbcTemplate.update(query,new Object[]{home.getName(),home.getMail(),home.getAddr()});

        System.out.println("Records Inserted....."+i);

    }

    public void deleteFromHome(int id){
        String query = "delete from home where id = ?";

        int i = jdbcTemplate.update(query,new Object[]{id});

        System.out.println("record Deleted...."+i);
    }

    public void updateHome(String name,int id){
        String query = "update home set name=?  where id = ?";

        int i = jdbcTemplate.update(query,new Object[]{name,id});

        System.out.println("record Updated...."+i);
    }


    public List<Home> getDataByBeanPro(){

        String query = "select * from home";

        List<Home> homeList = jdbcTemplate.query(query,new BeanPropertyRowMapper<>(Home.class));

        return homeList;
    }


    public List<Home1> getDataByRowMapper(){

        String query = "select * from home";

        List<Home1> homeList =jdbcTemplate.query(query,new HomeMapper());

        return homeList;
    }
}
