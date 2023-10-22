package com.jay.merchantservice.controller;

import com.jay.merchantservice.model.TransactionDetails;
import com.jay.merchantservice.proxy.TransactionDetailsProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/merchants")
public class MerchantController {
    private static final Logger LOG = LoggerFactory.getLogger(MerchantController.class);

    @Value("${merchant-service.test}")
    private String propertyValue;

    @Autowired
    private TransactionDetailsProxy transactionDetailsProxy;

    @GetMapping("/transactions")
    public List<TransactionDetails> getAllTransactions(){
        LOG.info("testAPI called... value = ");
        System.out.println("propertyValue = " + propertyValue);
        List<TransactionDetails>  transactionList = transactionDetailsProxy.getTransaction();
        LOG.info("transactionList = " + transactionList);
        return transactionList;
    }
}
