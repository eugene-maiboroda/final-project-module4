package com.javarush.entity;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(schema = "world", name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    @Column
    private String district;
    @Column
    private Integer population;
}



