package com.springboot_simple_registration_login.service;

import com.springboot_simple_registration_login.model.MenuItem;
import com.springboot_simple_registration_login.repo.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuItemRepository menuRepo;

    public List<MenuItem> getAllItems() {
        return menuRepo.findAll();
    }

    public MenuItem saveItem(MenuItem item) {
        return menuRepo.save(item);
    }

    public void deleteItem(Long id) {
        menuRepo.deleteById(id);
    }

    public MenuItem getItemById(Long id) {
        return menuRepo.findById(id).orElse(null);
    }
}