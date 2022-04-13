package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.model.Parts;
import com.example.inventorymanagemant.model.Products;
import com.example.inventorymanagemant.repositories.PartRepository;
import com.example.inventorymanagemant.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/13/2022
 * Time: 10:24 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class ProductDetailController {

    @Autowired
    private ApplicationContext context;
    @GetMapping("/productdetail")
    public String showForm(Model model){
        model.addAttribute("products", new Products());
        return "parts/form2";
    }

    @PostMapping("/productdetail")
    public String submitForm(@ModelAttribute Products products, Model model){
        model.addAttribute("products",products);
        ProductRepository repo=context.getBean(ProductRepository.class);
        repo.save(products);
        return "parts/confirmationaddproduct";
    }
}
