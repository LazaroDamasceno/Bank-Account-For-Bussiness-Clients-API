package com.api.v1.individual_customer;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.v1.exception.ForbiddenOperationException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RegisterIndividualCustomerService implements RegisterIndividualCustomer {

    private final IndividualCustomerRepository repository;

    @Override
    public ResponseEntity<Void> register(RegisterIndividualCustomerDTO dto) {
        Optional<IndividualCustomer> optional = repository.findBySsn(dto.ssn());
        if (optional.isPresent()) throw new ForbiddenOperationException("Individual customer already exist.");
        IndividualCustomer individualCustomer = new IndividualCustomer(dto);
        repository.save(individualCustomer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    
}
