package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.model.Parts;
import com.example.inventorymanagemant.model.MyID;
import com.example.inventorymanagemant.repositories.PartRepository;
import com.example.inventorymanagemant.repositories.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/send")
    public String send(@RequestParam(name="doc", required = false) String doc) {
        //change required = false as per requirement
        System.out.println("Doc: "+doc);
        Long partID=Long.parseLong(doc);
       partRepository.deleteById(partID);
        return "parts/confirmdelete";
    }

    @GetMapping("/send2")
    public String send2(@RequestParam(name="doc2", required = false) String doc2) {
        //change required = false as per requirement
        System.out.println("Doc2: "+doc2);
        Long productID=Long.parseLong(doc2);
        productRepository.deleteById(productID);
        return "parts/confirmdelete2";
    }
}
