package com.springboot_simple_registration_login.controller;

import com.springboot_simple_registration_login.model.MenuItem;
import com.springboot_simple_registration_login.model.Order;
import com.springboot_simple_registration_login.model.OrderItem;
import com.springboot_simple_registration_login.service.OrderService;
import com.springboot_simple_registration_login.service.MenuService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@Autowired
	private MenuService menuService;
	

	@GetMapping
	public String ordersPage(Model model) {

	    model.addAttribute("orders", orderService.getAllOrders());
	    model.addAttribute("menuItems", menuService.getAllItems());

	    Order order = new Order();

	    OrderItem orderItem = new OrderItem();
	    orderItem.setMenuItem(new MenuItem()); 

	    List<OrderItem> items = new ArrayList<>();
	    items.add(orderItem);

	    order.setItems(items);

	    model.addAttribute("order", order);

	    return "orders";
	}

	@PostMapping("/create")
	public String createOrder(@ModelAttribute Order order) {
		orderService.createOrder(order);
		return "redirect:/orders";
	}

	@GetMapping("/status/{id}/{status}")
	public String updateStatus(@PathVariable Long id, @PathVariable String status) {
		orderService.updateStatus(id, status);
		return "redirect:/orders";
	}

	@GetMapping("/delete/{id}")
	public String deleteOrder(@PathVariable Long id) {
		orderService.deleteOrder(id);
		return "redirect:/orders";
	}

	@GetMapping("/bill/{id}")
	public String viewBill(@PathVariable Long id, Model model) {
		model.addAttribute("order", orderService.getOrderById(id));
		return "bill";
	}
}