package com.sanam.rentcloud.profileservice.controller;

import com.sanam.rentcloud.commons.model.Customer;
import com.sanam.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {


    @Autowired
    private CustomerService customerService;


    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer){

        return customerService.saveCustomer(customer);
    }
}
