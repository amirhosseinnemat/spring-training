package com.bank.simulator.controller;

import com.bank.simulator.dto.BankRequest;
import com.bank.simulator.dto.BankResponse;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class BankSimulatorController {

    @GetMapping("/test")
    public String test() {
        return "test bank simulator";
    }




    // just for test
    @PostMapping("/simulator")
    public BankResponse checkTransaction(@RequestBody BankRequest bankRequest) {

        BankResponse response = new BankResponse();

        if (bankRequest.getCardNumber() == 5022) {
            response.setStatus("ok");
            response.setMessage("card number exist");
        } else {
            response.setStatus("not found");
            response.setMessage("card number not exist");
        }
        return response;
    }

}
