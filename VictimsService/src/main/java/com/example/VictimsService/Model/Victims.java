package com.example.VictimsService.Model;


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
public class Victims {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long victims_id;
    private String name;
    private String edad;
    private String dni;
}
