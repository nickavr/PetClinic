package com.project.petclinic.controllers;

import com.project.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //another way of mapping for the entire class; all methods will have this prefix for the route
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"}) //multiple options for the route
    public String listVets(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
