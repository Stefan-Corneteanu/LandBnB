package com.upb.rsf.LandBnB.controllers;

import com.upb.rsf.LandBnB.domain.User;
import com.upb.rsf.LandBnB.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }


    //-populate the model with the retrieved users!
    //-select the appropriate view (navigation)
    /*
    @GetMapping("/admin")
    public String viewUsers(Model model){
        model.addAttribute("users",userService.findAll());
        return "users";
    }
    ///MIGHT BE USEFUL FOR AN ADMIN PANEL
     */

    //redone the mappings for users
    @GetMapping("/signup")
    public String showAddUserForm(Model model){
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String addUser(User user){
        if(user.getId()==null)
            user.setId(new Random().nextLong());
        userService.save(user);
        return "redirect:/";
    }

    //should do sth similar for login

    @GetMapping("/login")
    public String showLoginForm(Model model){
        model.addAttribute("user",new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(User user){
        for (User u : userService.findAll()){
            if (user.equals(u)){
                //code for login as user
            }
        }
        return "redirect:/";
    }
}