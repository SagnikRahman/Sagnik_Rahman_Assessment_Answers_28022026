package com.hibernate.hibernate_cust_ord_crud;

import java.time.LocalDate;
import java.util.List;

public class App {

    public static void main(String[] args) {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();

        Customer customer = new Customer(1,"Sagnik","sagnik@gmail.com","Male",7044044852L,LocalDate.now());
        Order order = new Order(101,"ORD1001","Laptop",1,75000,LocalDate.now());

        customerDAO.insertCustomer(customer);

        // Update Customer
        customer.setCustomerName("Sagnik Rahman");
        customerDAO.updateCustomer(customer);

        // Fetch Customer by ID
        Customer c = customerDAO.fetchCustomerById(1);
        System.out.println("Customer Name: " + c.getCustomerName());

        // Fetch All Customers
        List<Customer> customers = customerDAO.fetchAllCustomers();
        for(Customer cust : customers){
            System.out.println(cust.getCustomerName());
        }

        // Fetch Customer by Email
        Customer emailCustomer = customerDAO.fetchCustomerByEmail("sagnik@gmail.com");
        System.out.println("Customer by Email: " + emailCustomer.getCustomerName());

        // Update Order
        order.setProductName("Gaming Laptop");
        orderDAO.updateOrder(order);

        // Fetch Order by ID
        Order o = orderDAO.fetchOrderById(101);
        System.out.println("Order Product: " + o.getProductName());

        // Delete Customer
        customerDAO.deleteCustomer(1);

    }
}