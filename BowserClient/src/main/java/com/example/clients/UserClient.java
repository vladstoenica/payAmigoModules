package com.example.clients;


import com.example.dto.UserDto;
import com.example.payAmigo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Component
@FeignClient(url="http://localhost:8082/users", value="users")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    User getUserById(@PathVariable("id") int id);

    @GetMapping("/api/users")
    List<User> getAllUsers();

    @DeleteMapping("/api/users/{id}")
    void deleteById(@PathVariable("id") int id);

    @PostMapping("/api/users")
    User save(@RequestBody UserDto userDto);
}
