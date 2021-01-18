/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.endpoint;

import com.mycompany.test.model.BankAccount;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author oem
 */

@RequestMapping("/api/bankaccount")
public interface BankAccountEndPoint {
    
    @PostMapping("save")
    ResponseEntity saveBankAccount(BankAccount ba);
}
