package com.banking.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.main.entity.BankId;
import com.banking.main.entity.UserDetails;

@Repository
public interface BankRepository extends JpaRepository<UserDetails , BankId> {
    UserDetails findByBankIdsUserId(String userId);
}