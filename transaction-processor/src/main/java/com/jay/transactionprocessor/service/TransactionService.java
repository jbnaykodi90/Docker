package com.jay.transactionprocessor.service;

import com.jay.transactionprocessor.model.TransactionDetails;

import java.util.List;

public interface TransactionService {
    void saveTransaction(TransactionDetails transactionDetails);
    List<TransactionDetails> getAllTransactions();
}
