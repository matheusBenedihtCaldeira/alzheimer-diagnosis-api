package com.alzheimer.diagnosis.api.models.enums;

public enum Role {
    ADMIN("admin"),
    USER("user"),
    DOCTOR("doctor");

    private String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}