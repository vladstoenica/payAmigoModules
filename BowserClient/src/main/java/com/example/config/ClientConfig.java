package com.example.config;

import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;

public class ClientConfig {

    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }
}
