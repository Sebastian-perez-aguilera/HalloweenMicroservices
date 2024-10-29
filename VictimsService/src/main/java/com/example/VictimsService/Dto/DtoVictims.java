package com.example.VictimsService.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoVictims {
        private Long victims_id;
        private String name;
        private String edad;
        private String dni;
        private List<DtoKillers> KillersList;
}
