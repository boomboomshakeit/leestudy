package com.example.tut04.dto;

import lombok.Data;

@Data
public class Regdto {

    private String email;
    private String passwd;

    @Override
    public String toString() {
        return "Regdto{" +
                "email='" + email + '\'' +
                ", passwd='" + passwd + '\'' +
                '}';
    }
}
