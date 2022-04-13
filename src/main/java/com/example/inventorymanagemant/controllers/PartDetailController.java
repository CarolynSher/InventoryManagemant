package com.example.inventorymanagemant.controllers;

import com.example.inventorymanagemant.bootstrap.BootStrapData;
import com.example.inventorymanagemant.model.Parts;
import com.example.inventorymanagemant.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
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

    @Autowired
    private ApplicationContext context;
    @GetMapping("/partdetail")
    public String showForm(Model model){
        model.addAttribute("parts", new Parts());
        return "parts/form1";
    }

    @PostMapping("/partdetail")
    public String submitForm(@ModelAttribute Parts parts, Model model){
        model.addAttribute("parts",parts);
        PartRepository repo=context.getBean(PartRepository.class);
        repo.save(parts);
        return "parts/confirmationaddpart";
    }
/*
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        PartRepository repo=context.getBean(PartRepository.class);
        Parts part = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));

        model.addAttribute("parts", part);
        return "update-user";
    }
    @PostMapping("/update/{id}")
    public String updateParts(@PathVariable("id") long id, @Valid Parts parts,
                              BindingResult result, Model model) {
        if (result.hasErrors()) {
            parts.setId(id);
            return "update-user";
        }
        PartRepository repo=context.getBean(PartRepository.class);
        repo.save(parts);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteParts(@PathVariable("id") long id, Model model) {
        PartRepository repo=context.getBean(PartRepository.class);
        Parts parts = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
        repo.delete(parts);
        return "redirect:/index";
    }*/
}
