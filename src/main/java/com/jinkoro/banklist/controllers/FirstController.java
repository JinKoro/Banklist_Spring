package com.jinkoro.banklist.controllers;


import com.jinkoro.banklist.model.Account;
import com.jinkoro.banklist.model.User;
import com.jinkoro.banklist.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

@Controller
public class FirstController {

    private Service service;

    @Autowired
    public void setFilmService(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/show-all-accounts")
    public ModelAndView allAccounts(){
        List<Account> accounts = service.findAllAccounts();
        ModelAndView modelAndView = new ModelAndView("allAcc");
        modelAndView.addObject("accounts",accounts);
        return modelAndView;
    }

    @GetMapping("/user-data")
    public ModelAndView userData(){
        ModelAndView modelAndView = new ModelAndView("userData");
        return modelAndView;
    }
    @PostMapping("yourID")
    public ModelAndView userDataPost(@RequestParam int yourID){
        ModelAndView modelAndView = new ModelAndView("userData");
        List<User> users = service.findUserDataById(yourID);
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    @GetMapping("/richest")
    public ModelAndView richest(){
        ModelAndView modelAndView = new ModelAndView("richest");
        return modelAndView;
    }
    @PostMapping("richest")
    public ModelAndView richestPost(){
        ModelAndView modelAndView = new ModelAndView("richest");
        List<Integer> max = service.max();
        modelAndView.addObject("max",max.get(0));
        return modelAndView;
    }

    @GetMapping("/sum")
    public ModelAndView sum(){
        ModelAndView modelAndView = new ModelAndView("sum");
        return modelAndView;
    }
    @PostMapping("sum")
    public ModelAndView sumPost(){
        ModelAndView modelAndView = new ModelAndView("sum");
        List<Integer> sum = service.sum();
        modelAndView.addObject("sum",sum.get(0));
        return modelAndView;
    }
}
