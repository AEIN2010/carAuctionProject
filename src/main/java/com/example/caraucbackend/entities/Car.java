package com.example.caraucbackend.entities;


import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {

    @Id
    private String vin;
    @NotNull
    private String make;
    @NotNull
    private String model;
    @NotNull
    private String year;
    @NotNull
    private long price;
    @NotNull
    private String image;
    @NotNull
    private String mileage;

    @ManyToOne
    @NotNull
    private User lister;

    @OneToMany
    private List<Bid> bidHistory;
}
