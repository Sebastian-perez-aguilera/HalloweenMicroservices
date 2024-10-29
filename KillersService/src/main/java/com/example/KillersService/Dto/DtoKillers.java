package com.example.KillersService.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoKillers {

        private Long id_killer;
        private String name;
        private String age;
        private double height;
        private String favorite_weapon;
        private Long victims_id;
        private List<Dtoplaces> dtoplace;



}