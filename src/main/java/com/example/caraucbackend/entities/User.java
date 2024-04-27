package com.example.caraucbackend.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import javax.validation.constraints.NotNull;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    private String name;

    @Id
    private String username;
    @NotNull
    private String password;
    @NotNull
    private char isAdmin;

}
