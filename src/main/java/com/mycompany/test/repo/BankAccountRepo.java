/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.repo;

import com.mycompany.test.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author oem
 */
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer>{
    
}
