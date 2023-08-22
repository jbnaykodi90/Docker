package com.jay.transactionprocessor.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="SeqTransactionDetails",sequenceName = "SeqTransactionDetails")
    private long transactionId;
    private String merchantId;
    private String terminalId;
    private String transactionDate;
    private String transactionTime;
    private String authCode;
    private double transactionAmount;
}
