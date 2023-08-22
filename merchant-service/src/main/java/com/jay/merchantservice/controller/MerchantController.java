package com.jay.merchantservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchantController {
    private static final Logger LOG = LoggerFactory.getLogger(MerchantController.class);

    @GetMapping("/testAPI")
    public String testAPI(){
        LOG.info("testAPI called...");
        return "Result from API";
    }
}
