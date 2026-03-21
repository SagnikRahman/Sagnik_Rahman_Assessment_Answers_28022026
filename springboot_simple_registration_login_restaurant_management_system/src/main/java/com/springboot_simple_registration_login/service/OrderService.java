package com.springboot_simple_registration_login.service;

import com.springboot_simple_registration_login.model.*;
import com.springboot_simple_registration_login.repo.OrderRepository;
import com.springboot_simple_registration_login.repo.MenuItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private MenuItemRepository menuRepo;

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    public Order createOrder(Order order) {

        double total = 0;

        for (OrderItem item : order.getItems()) {

            MenuItem menuItem = menuRepo.findById(
                    item.getMenuItem().getId()
            ).orElseThrow(() -> new RuntimeException("Item not found"));

            double price = menuItem.getPrice();

            total += price * item.getQuantity();

            item.setMenuItem(menuItem);
            item.setOrder(order);
        }

        double tax = total * 0.05;
        total += tax;

        order.setTotalAmount(total);
        order.setStatus("Pending");

        return orderRepo.save(order);
    }

    public void updateStatus(Long id, String status) {
        Order order = orderRepo.findById(id).orElseThrow();
        order.setStatus(status);
        orderRepo.save(order);
    }

    public Order getOrderById(Long id) {
        return orderRepo.findById(id).orElse(null);
    }

    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}