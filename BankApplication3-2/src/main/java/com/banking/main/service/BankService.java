package com.banking.main.service;

import com.banking.main.request.RegistrationRequestPOJO;
import com.banking.main.response.RegrasationsResponsePOJO;

public interface BankService {
    RegrasationsResponsePOJO registrationUserDetails(RegistrationRequestPOJO registrationRequestPOJO);

}

