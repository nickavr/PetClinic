package com.project.petclinic.controllers;

import com.project.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"}) //multiple options for the route
    public String listVets(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
