package com.springboot_simple_registration_login.service;

import com.springboot_simple_registration_login.model.Staff;
import com.springboot_simple_registration_login.repo.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    private StaffRepository staffRepo;

    public List<Staff> getAllStaff() {
        return staffRepo.findAll();
    }

    public Staff saveStaff(Staff staff) {
        return staffRepo.save(staff);
    }

    public void deleteStaff(Long id) {
        staffRepo.deleteById(id);
    }

    public Staff getStaffById(Long id) {
        return staffRepo.findById(id).orElse(null);
    }
}