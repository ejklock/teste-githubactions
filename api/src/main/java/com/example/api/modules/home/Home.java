package com.example.api.modules.home;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Home {

    private Long id;
    private String message;
}
