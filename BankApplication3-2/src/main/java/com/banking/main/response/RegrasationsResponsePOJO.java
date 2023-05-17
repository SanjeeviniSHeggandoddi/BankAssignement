package com.banking.main.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegrasationsResponsePOJO {
	
	 private Integer responseCode; 
	 private Object data ; 
	 private Object ResponseDescription;
	  
	 
	
	 // public String statusMessage;
	//  public String userId; 
	 // public int accountNo;
	 
}
