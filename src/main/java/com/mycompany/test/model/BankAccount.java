/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author oem
 */
@Data
@Entity
@Table(name = "bank_account")
public class BankAccount {
    @Id
    private Integer id;
    
    @Column
    private String bankName;
    
    @Column
    private String accountNumber;
}
