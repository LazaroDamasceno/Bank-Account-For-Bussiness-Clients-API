package com.api.v1.business_client;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.api.v1.exception.ForbiddenOperationException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class FindBusinessClientService {

    private final BusinessClientRepository repository;

    public BusinessClient find(String ein) {
        Optional<BusinessClient> optional = repository.findByEin(new BigInteger(ein));
        if (optional.isEmpty()) throw new ForbiddenOperationException("Business client does not exist.");
        return optional.get();
    }
    
}