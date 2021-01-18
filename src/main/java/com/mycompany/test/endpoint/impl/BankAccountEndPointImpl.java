/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.endpoint.impl;

import com.mycompany.test.endpoint.BankAccountEndPoint;
import com.mycompany.test.model.BankAccount;
import com.mycompany.test.service.BankAccountService;
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
public class BankAccountEndPointImpl implements BankAccountEndPoint{

    @Autowired
    private CustomerService accountService;
    
    @Override
    public ResponseEntity saveBankAccount(@RequestBody BankAccount ba) {
        return accountService.saveBankAccount(ba);
    }
    
}
