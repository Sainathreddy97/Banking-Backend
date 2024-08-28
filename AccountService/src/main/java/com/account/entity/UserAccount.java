package com.account.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
	private long customerId;
	private long accountNumber;
    private String accountHolderFirstName;
    private String accountHolderLaststName;
    private String adharNo;
    private String panNo;
    private String gmail;
    private long phoneNo;
    private String accountType;
    private String gender;
    private String nationality;
    private String dateOfBirth;
    private String accountBranch;
    private String loan;
    
    
    
    
    
    
}
