package com.spring.thirdjdbcApp.controller;


import com.spring.thirdjdbcApp.model.Home;
import com.spring.thirdjdbcApp.model.Home1;
import com.spring.thirdjdbcApp.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("home")

public class HomeCtrl {

    @Autowired
    private HomeService homeService;

    Logger logger = LoggerFactory.getLogger(HomeCtrl.class);

    @GetMapping("h")
    public String home(){

        logger.trace("trace method accessed...");
        logger.debug("Debugging....");
        logger.info("Informing...");
        logger.warn("Warning....");
        logger.error("Error happened....");

        return "hello from spring world...";

    }

    @PostMapping("add")
    public void addToHome(@RequestBody Home home){

        homeService.addToHome(home);
    }

    @GetMapping("delete/{id}")
    public void deleteFromHome(@PathVariable("id") int id){
        homeService.deleteFromHome(id);
    }

    @PostMapping("update/{name}/{id}")
    public void updateHome(@PathVariable("name") String name,@PathVariable("id") int id){
        homeService.updateHome(name, id);
    }

    @GetMapping("bean")
    public List<Home> getDataByBeanPro(){
        return homeService.getDataByBeanPro();
    }

    @GetMapping("row")
    public List<Home1> getDataByRowMapper(){
        return homeService.getDataByRowMapper();

    }
}
