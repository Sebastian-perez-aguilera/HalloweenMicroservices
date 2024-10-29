package com.example.KillersService.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Killers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_killer;
    private String name;
    private String age;
    private double height;
    private String favorite_weapon;
    private Long victims_id;



}
