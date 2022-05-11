package com.upb.rsf.LandBnB.controllers;

import com.upb.rsf.LandBnB.domain.Estate;
import com.upb.rsf.LandBnB.services.EstateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;

@Controller
@RequestMapping("/")
public class EstateController {
    private final EstateService estateService;
    public EstateController(EstateService estateService) {
        this.estateService = estateService;
    }


    //-populate the model with the retrieved estates!
    //-select the appropriate view (navigation)
    @GetMapping
    public String viewEstates(Model model){
        model.addAttribute("estates",estateService.findAll());
        return "estates";
    }

    @GetMapping("/new")
    public String showAddEstateForm(Model model){
        model.addAttribute("estate",new Estate());
        return "addestates"; //create the .html file later
    }

    @PostMapping("/new")
    public String addEstate(Estate estate){
        if(estate.getId()==null)
            estate.setId(new Random().nextLong());
        estateService.save(estate);
        return "redirect:/"; //go to index.html, look for your post
    }

}