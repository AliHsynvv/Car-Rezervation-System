package com.carrezerv.company.dto;

import lombok.*;

import java.io.Serializable;

/**
 * A DTO for the {@link com.carrezerv.company.entity.UserEntity} entity
 */
@Data
public class UserEntityDto implements Serializable {
    private  int id;
    private  String name;
    private  String password;
    private  String email;
}