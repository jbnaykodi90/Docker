package com.jay.transactionprocessor.repository;

import com.jay.transactionprocessor.model.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDetailsJpaRepository extends JpaRepository<TransactionDetails, Integer> {
}
