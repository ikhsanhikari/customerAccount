/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.endpoint;

import com.mycompany.test.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author oem
 */
@RequestMapping("/api/customer/")
public interface CustomerEndPoint {
    @PostMapping("/save")
    ResponseEntity saveCustomer(Customer c);
    
    @PostMapping("edit")
    ResponseEntity editCustomer(Customer c);
}
