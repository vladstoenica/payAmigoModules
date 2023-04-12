package com.example.controller;

import com.example.payAmigo.entity.Wallet;
import com.example.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client/wallet")
public class WalletController {

    @Autowired
    WalletService walletService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Wallet>> getWalletsByUser(@PathVariable("userId") int userId) {
        List<Wallet> wallets = walletService.getWalletsByUser(userId);
        return ResponseEntity.ok(wallets);
    }

}
