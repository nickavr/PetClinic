package com.project.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //another way of mapping for the entire class; all methods will have this prefix for the route
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"}) //multiple options for the route
    public String listVets(){
        return "owners/index";
    }
}
