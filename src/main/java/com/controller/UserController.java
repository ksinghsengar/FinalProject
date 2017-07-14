package com.controller;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.model.User;
import com.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Controller
public class UserController {
@Autowired
    UserService userService;

        @RequestMapping(value = "/register",method = RequestMethod.POST)
        public ModelAndView register (@ModelAttribute("User") User user, BindingResult result){
            ModelAndView modelAndView;
            if(result.hasErrors()){
                System.out.println("BINDING Error");
            }
            user.setDateCreated(new Date());
            user.setLastUpdated(new Date());
            user.setAdmin(false);
            user.setActive(true);
            if (userService.saveOrUpdateUser(user)) {
            modelAndView = new ModelAndView("dashboard");

        }
        else {
            modelAndView = new ModelAndView("home");

        }
            return modelAndView;

    }

    @RequestMapping(value="/getuser")
   @ResponseBody
    public  ModelAndView getUser(){
            ModelAndView modelAndView = new ModelAndView("dashboard");
        System.out.println("users"+userService.getUser());
        modelAndView.addObject("Users",userService.getUser());
        return modelAndView;
    }
    }


