package com.api.v1.individual_customer;

import java.math.BigInteger;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualCustomerRepository extends JpaRepository<IndividualCustomer, UUID> {

    Optional<IndividualCustomer> findBySsn(BigInteger ssn);
    
}