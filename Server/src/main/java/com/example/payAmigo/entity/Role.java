package com.example.payAmigo.entity;

public enum Role {
    USER("USER"),
    MANAGER("MANAGER"),
    ADMIN("ADMIN");

    private String userRole;

    Role(String userRole) {
        this.userRole = userRole;
    }

    public String getUserRole() {
        return userRole;
    }
}
