/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.service.impl;

import com.mycompany.test.model.BankAccount;
import com.mycompany.test.model.Customer;
import com.mycompany.test.repo.BankAccountRepo;
import com.mycompany.test.repo.CustomerRepo;
import com.mycompany.test.service.CustomerService;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author oem
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;
    
    @Autowired
    private BankAccountRepo accountRepo;
    
    @Transactional
    @Override
    public ResponseEntity saveCustomer(Customer c) {
        if(c!=null){
            customerRepo.save(c);
            return ResponseEntity.ok("successfully save customer");
        }
        return ResponseEntity.badRequest().body("failed to save customer");
    }

    @Override
    public ResponseEntity editCustomer(Customer c,Integer id) {
        if(c!=null && id !=null){
            c.setId(id);
            customerRepo.save(c);
            return ResponseEntity.ok("successfully edit customer");
        }
        return ResponseEntity.badRequest().body("failed to edit customer");
    }

    @Override
    public ResponseEntity saveBankAccount(BankAccount ba) {
        if(ba!=null){
            accountRepo.save(ba);
            return ResponseEntity.ok("successfully save bank account");
        }
        return ResponseEntity.badRequest().body("failed to save bank account");
    }
    
}
