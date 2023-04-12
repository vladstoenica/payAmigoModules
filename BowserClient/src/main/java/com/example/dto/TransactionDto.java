package com.example.dto;

import com.example.payAmigo.entity.Wallet;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransactionDto {

    private int id;
    private double amount;
    private double commissionPercent;
    private double commissionAmount;
    private String currency;
    private Date createdAt;
    private Wallet sourceWallet;
    private Wallet destinationWallet;
}
