package com.example.clients;

import com.example.payAmigo.entity.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Component
@FeignClient(url="http://localhost:8082/wallet", value="wallet")
public interface WalletClient {

    @GetMapping("/api/wallets/user/{userId}")
    List<Wallet> getWalletsByUser(@PathVariable("userId") int userId);

}
