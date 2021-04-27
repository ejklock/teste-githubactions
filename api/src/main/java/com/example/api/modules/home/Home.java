package com.example.api.modules.home;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Home {

    @Id
    private Long id;
    
    private String message;
}
