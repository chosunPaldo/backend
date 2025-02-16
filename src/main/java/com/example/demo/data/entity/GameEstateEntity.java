package com.example.demo.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "game_estate")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GameEstateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estate_id;
    private String name;
    private int price;
}
