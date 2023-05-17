package com.banking.main.controller;

import com.banking.main.request.RegistrationRequestPOJO;
import com.banking.main.response.RegrasationsResponsePOJO;
import com.banking.main.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api")
public class BankController {
    private final BankService bankService;

    @PostMapping(path = "/registeruserdetails")
    public ResponseEntity<RegrasationsResponsePOJO> registeruserdetails(@RequestBody RegistrationRequestPOJO registrationRequestPOJO){
        RegrasationsResponsePOJO regrasationsResponsePOJO  = bankService.registrationUserDetails(registrationRequestPOJO);

        return ResponseEntity.ok().body(regrasationsResponsePOJO);
    }
}
