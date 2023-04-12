package com.example.clients;

import com.example.dto.TransactionDto;
import com.example.payAmigo.entity.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@FeignClient(url="http://localhost:8082/transfer", value="transfer")
public interface TransactionClient {

    @PostMapping("/api/transfers")
    Transaction processTransaction(@RequestBody TransactionDto transactionDto);
}
