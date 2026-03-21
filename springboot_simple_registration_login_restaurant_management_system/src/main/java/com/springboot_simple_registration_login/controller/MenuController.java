package com.springboot_simple_registration_login.controller;

import com.springboot_simple_registration_login.model.MenuItem;
import com.springboot_simple_registration_login.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    public String menuPage(Model model) {
        model.addAttribute("items", menuService.getAllItems());
        return "menu";
    }

    @PostMapping("/add")
    public String addItem(@ModelAttribute MenuItem item) {
        menuService.saveItem(item);
        return "redirect:/menu";
    }

    @GetMapping("/delete/{id}")
    public String deleteItem(@PathVariable Long id) {
        menuService.deleteItem(id);
        return "redirect:/menu";
    }
}