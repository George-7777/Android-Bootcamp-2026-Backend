package ru.sicampus.bootcamp2026.entity;


import jakarta.persistence.*;
import lombok.Data;

@Table(name = "room")
@Entity
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "human_count")
    private Integer human_count;

    @Column(name = "name")
    private String name;
}
