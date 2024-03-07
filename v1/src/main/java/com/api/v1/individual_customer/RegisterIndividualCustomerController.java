package com.api.v1.individual_customer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.v1.generic_interfaces.Register;

import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/individual-customer")
@AllArgsConstructor
class RegisterIndividualCustomerController implements Register<RegisterIndividualCustomerDTO> {
    
    private final RegisterIndividualCustomerService service;
    
    @Override
    @PostMapping
    public ResponseEntity<Void> register(@RequestBody RegisterIndividualCustomerDTO dto) {
        return service.register(dto);
    }
    
}