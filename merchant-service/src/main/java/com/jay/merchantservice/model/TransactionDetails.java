package com.jay.merchantservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionDetails {
    private long transactionId;
    private String merchantId;
    private String terminalId;
    private String transactionDate;
    private String transactionTime;
    private String authCode;
    private double transactionAmount;
}
