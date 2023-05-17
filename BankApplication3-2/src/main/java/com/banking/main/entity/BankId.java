package com.banking.main.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

//import javax.persistence.Embeddable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BankId implements Serializable {
   
	private static final long serialVersionUID = 1L;
	private String userId;
    private int accountNo;
}


