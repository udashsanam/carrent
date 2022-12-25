package com.sanam.rentcloud.profileservice.service;

import com.sanam.rentcloud.commons.model.Customer;
import com.sanam.rentcloud.profileservice.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {

        return customerRepository.save(customer);
    }
}
