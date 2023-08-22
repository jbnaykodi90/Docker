package com.jay.transactionprocessor.service.impl;

import com.jay.transactionprocessor.model.TransactionDetails;
import com.jay.transactionprocessor.repository.TransactionDetailsJpaRepository;
import com.jay.transactionprocessor.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private static final Logger LOG = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Autowired
    private TransactionDetailsJpaRepository transactionDetailsJpaRepository;

    @Override
    public void saveTransaction(TransactionDetails transactionDetails) {
        LOG.info("before saveTransaction");
        transactionDetailsJpaRepository.save(transactionDetails);
        LOG.info("after saveTransaction");
    }

    @Override
    public List<TransactionDetails> getAllTransactions(){
        return transactionDetailsJpaRepository.findAll();
    }
}
