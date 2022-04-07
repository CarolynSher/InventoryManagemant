package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.model.Parts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/6/2022
 * Time: 4:33 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PartDetailController {
    @GetMapping("/partdetail")
    public String detailForm(Model model){
        model.addAttribute("parts", new Parts());
        return "parts";
    }

    @PostMapping("/partdetail")
    public String detailSubmit(@ModelAttribute Parts parts, Model model){
        model.addAttribute("parts",parts);
        return "result";
    }
}
