package com.springboot_simple_registration_login.controller;

import com.springboot_simple_registration_login.model.Staff;
import com.springboot_simple_registration_login.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public String staffPage(Model model) {
        model.addAttribute("staffList", staffService.getAllStaff());
        return "staff";
    }

    @PostMapping("/add")
    public String addStaff(@ModelAttribute Staff staff) {
        staffService.saveStaff(staff);
        return "redirect:/staff";
    }

    @GetMapping("/delete/{id}")
    public String deleteStaff(@PathVariable Long id) {
        staffService.deleteStaff(id);
        return "redirect:/staff";
    }
}