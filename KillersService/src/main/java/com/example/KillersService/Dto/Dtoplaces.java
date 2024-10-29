package com.example.KillersService.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Dtoplaces {

        private Long id_place;
        private String kind_place;
        private Double size;
        private Long id_killer;

}
