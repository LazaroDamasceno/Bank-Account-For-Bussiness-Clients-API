package com.api.v1.bank_account;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/bank-account")
@AllArgsConstructor
public class WithdrawController {

    private final WithdrawCashService service;

    @PatchMapping("ein/{ein}/accountNumber/{accountNumber}/amount/{amount}")
    public ResponseEntity<Void> withdraw(@PathVariable String ein, 
                                        @PathVariable String accountNumber, 
                                        @PathVariable double amount
    ) {
        return service.withdraw(ein, accountNumber, amount);
    }
    
}
