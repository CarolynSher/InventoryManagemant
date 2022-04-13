package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.repositories.PartRepository;
import com.example.inventorymanagemant.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/13/2022
 * Time: 4:23 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MainMenuController {


    @RequestMapping("/")
    public ModelAndView welcome(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("parts/welcome");
        return modelAndView;
    }
}
