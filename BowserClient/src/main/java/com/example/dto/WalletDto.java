package com.example.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WalletDto {

    private int id;
    private String name;
    private double balance;
    private String currency;
//    private User user;
}
