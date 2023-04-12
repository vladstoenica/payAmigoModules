package com.example.service;

import com.example.clients.TransactionClient;
import com.example.dto.TransactionDto;
import com.example.payAmigo.entity.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    TransactionClient transactionClient;

    public Transaction processTransaction(TransactionDto transactionDto) {
        return transactionClient.processTransaction(transactionDto);
    }
}
