package com.spring.thirdjdbcApp.service;

import com.spring.thirdjdbcApp.model.Home;
import com.spring.thirdjdbcApp.model.Home1;
import com.spring.thirdjdbcApp.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    @Autowired
    private HomeRepository homeRepository;

    public void addToHome(Home home){
        homeRepository.addToHome(home);
    }

    public void deleteFromHome(int id){
        homeRepository.deleteFromHome(id);
    }

    public void updateHome(String name,int id){
        homeRepository.updateHome(name, id);
    }

    public List<Home> getDataByBeanPro(){
        return homeRepository.getDataByBeanPro();
    }

    public List<Home1> getDataByRowMapper(){
        return homeRepository.getDataByRowMapper();
    }

}
