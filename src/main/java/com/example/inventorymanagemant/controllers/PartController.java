package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.repositories.PartRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Project: InventoryManagemant
 * Package: com.example.inventorymanagemant.controllers
 * <p>
 * User: carolyn.sher
 * Date: 4/2/2022
 * Time: 3:57 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PartController {
    private final PartRepository partRepository;

    public PartController(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @RequestMapping("/parts")
    public String getParts(Model model){
        model.addAttribute("parts",partRepository.findAll());
        return "parts/list";
    }
}
