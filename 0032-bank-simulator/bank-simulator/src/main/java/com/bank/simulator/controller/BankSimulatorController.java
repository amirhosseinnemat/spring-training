package com.bank.simulator.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class BankSimulatorController {

    @GetMapping("/test")
    public String test() {
        return "test bank simulator";
    }










}
