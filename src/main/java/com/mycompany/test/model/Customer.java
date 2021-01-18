/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author oem
 */

@Data
@Entity
@Table(name = "customer")
public class Customer {
    
    @Id
    private Integer id;
    
    @Column
    private String username;
    
    @Column
    private String password;
    
    @Column
    private String firstName;
    
    @Column
    private String lastName;
    
    @JoinColumn
    private BankAccount bankAccountId;
}
