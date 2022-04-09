package com.receiverservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.receiverservice.entities.Transaction;


public interface TransactionRepositories extends JpaRepository<Transaction, String> {

}
