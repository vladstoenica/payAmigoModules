package com.example.service;

import com.example.clients.WalletClient;
import com.example.payAmigo.entity.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {

    @Autowired
    WalletClient walletClient;

    public List<Wallet> getWalletsByUser(int userId) {
        return walletClient.getWalletsByUser(userId);
    }

}
