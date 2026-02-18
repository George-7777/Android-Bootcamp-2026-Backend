package ru.sicampus.bootcamp2026.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private long id;
    private String username;
    private String passwd_hash;
    private List<Long> bookingNames;
}
