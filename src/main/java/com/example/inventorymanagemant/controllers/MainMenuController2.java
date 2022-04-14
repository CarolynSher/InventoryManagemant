package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.repositories.PartRepository;
import com.example.inventorymanagemant.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/14/2022
 * Time: 8:48 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class MainMenuController2 {
    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    public MainMenuController2(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository=productRepository;
    }

    @RequestMapping("/")
    public String getPartsAndProducts(Model model){
        model.addAttribute("parts",partRepository.findAll());
        model.addAttribute("products",productRepository.findAll());
        return "parts/welcomeinventory";
    }

}
