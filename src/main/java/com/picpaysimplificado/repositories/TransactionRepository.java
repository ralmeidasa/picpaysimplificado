package com.picpaysimplificado.repositories;

import com.picpaysimplificado.model.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
