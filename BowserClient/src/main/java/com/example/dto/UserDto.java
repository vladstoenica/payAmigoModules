package com.example.dto;


import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {

    private int id;
    private String name;
    private String email;
    private String password;
//    private Wallet wallet;
}
