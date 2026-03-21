package com.springboot_simple_registration_login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.springboot_simple_registration_login.model.User;
import com.springboot_simple_registration_login.service.MenuService;
import com.springboot_simple_registration_login.service.OrderService;
import com.springboot_simple_registration_login.service.StaffService;
import com.springboot_simple_registration_login.service.UserService;

@Controller
public class AuthController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private OrderService orderService;

	@Autowired
	private MenuService menuService;

	@Autowired
	private StaffService staffService;

	@GetMapping("/")
	public String home() {
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute User user, Model model) {
		userService.register(user);
		return "success";
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {

		boolean isValid = userService.login(email, password);

		if (isValid) {
			return "redirect:/dashboard";
		} else {
			model.addAttribute("error", "Invalid credentials");
			return "login";
		}
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

	    long totalOrders = orderService.getAllOrders().size();
	    long totalMenu = menuService.getAllItems().size();
	    long totalStaff = staffService.getAllStaff().size();

	    double totalRevenue = orderService.getAllOrders()
	            .stream()
	            .mapToDouble(o -> o.getTotalAmount())
	            .sum();

	    model.addAttribute("totalOrders", totalOrders);
	    model.addAttribute("totalMenu", totalMenu);
	    model.addAttribute("totalStaff", totalStaff);
	    model.addAttribute("totalRevenue", totalRevenue);

	    return "dashboard";
	}
}