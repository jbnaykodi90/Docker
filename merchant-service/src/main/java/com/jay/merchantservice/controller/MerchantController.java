package com.jay.merchantservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/merchants")
public class MerchantController {
    private static final Logger LOG = LoggerFactory.getLogger(MerchantController.class);

    @GetMapping("/transactions")
    public String getAllTransactions(){
        LOG.info("testAPI called...");
        return "Result from API";
    }
}
