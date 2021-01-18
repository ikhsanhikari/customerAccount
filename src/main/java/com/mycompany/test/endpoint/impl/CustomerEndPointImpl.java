/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.endpoint.impl;

import com.mycompany.test.endpoint.CustomerEndPoint;
import com.mycompany.test.model.Customer;
import com.mycompany.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oem
 */
@RestController
public class CustomerEndPointImpl implements CustomerEndPoint{

    @Autowired
    private CustomerService  customerService;
            
            
    @Override
    public ResponseEntity saveCustomer(@RequestBody Customer c) {
        return customerService.saveCustomer(c);
    }

    @Override
    public ResponseEntity editCustomer(@RequestBody Customer c) {
        return customerService.editCustomer(c, c.getId());
    }
    
}
