package org.learning.openapiplayground.controller;

import org.openapitools.api.AccountApi;
import org.openapitools.model.Account;
import org.openapitools.model.DepositRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Void> depositToAccount(DepositRequest depositRequest) {
        //Execute the business logic through Service/Utils/Repository classes
        //return AccountApi.super.depositToAccount(depositRequest);

        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Account> getAccount() {
        //Execute the business logic through Service/Utils/Repository classes
        //return AccountApi.super.getAccount();

        return ResponseEntity.ok(new Account());
    }
}
