/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.service;

import com.mycompany.test.model.BankAccount;
import com.mycompany.test.model.Customer;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author oem
 */
public interface CustomerService {
    ResponseEntity saveCustomer(Customer c);
    ResponseEntity editCustomer(Customer c,Integer id);
    ResponseEntity saveBankAccount(BankAccount ba);
}
