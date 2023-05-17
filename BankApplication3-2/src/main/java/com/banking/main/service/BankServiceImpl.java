package com.banking.main.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.banking.main.entity.BankId;
import com.banking.main.entity.UserDetails;
import com.banking.main.repository.BankRepository;
import com.banking.main.request.RegistrationRequestPOJO;
import com.banking.main.response.RegrasationsResponsePOJO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;

    @Override
    public RegrasationsResponsePOJO registrationUserDetails(RegistrationRequestPOJO registrationRequestPOJO) {


        UserDetails userDetails1 = bankRepository.findByBankIdsUserId(registrationRequestPOJO.getUserId());


        if (userDetails1 == null) {
            BankId bankId = new BankId();
            bankId.setUserId(registrationRequestPOJO.getUserId());
            bankId.setAccountNo(registrationRequestPOJO.getAccountNo());
            UserDetails userRepsonse = bankRepository.save(new UserDetails(bankId, registrationRequestPOJO.getPassword()));
            return new RegrasationsResponsePOJO(
                   HttpStatus.OK.value(),userRepsonse, "Registered successfully");
        }
       return new RegrasationsResponsePOJO(
               
        );
    }
}

