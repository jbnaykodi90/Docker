package com.jay.transactionprocessor.controller;

import com.jay.transactionprocessor.model.TransactionDetails;
import com.jay.transactionprocessor.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {
    private static final Logger LOG = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transactions")
    public List<TransactionDetails> getTransaction(){
        LOG.info("getTransaction method of TransactionController");
        return transactionService.getAllTransactions();
    }

    @PostMapping("/transactions")
    public String saveTransaction(@RequestBody TransactionDetails transactionDetails){
        LOG.info("saveTransaction api called");
        //TransactionDetails tran1 = new TransactionDetails(123, "10000001", "1001", "20230822", "185602", "123456", 123.45);
        transactionService.saveTransaction(transactionDetails);
        return "Transaction saved";
    }

}
