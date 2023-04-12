package com.example.controller;

import com.example.dto.TransactionDto;
import com.example.payAmigo.entity.Transaction;
import com.example.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> processTransaction(@RequestBody TransactionDto transactionDto) {
        Transaction transaction = transactionService.processTransaction(transactionDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(transaction);
    }
}
