package com.jay.merchantservice.proxy;

import com.jay.merchantservice.model.TransactionDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="transaction-processor")
public interface TransactionDetailsProxy {
    @GetMapping("/transactions")
    public List<TransactionDetails> getTransaction();
}
