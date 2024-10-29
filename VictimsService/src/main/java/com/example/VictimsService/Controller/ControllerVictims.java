package com.example.VictimsService.Controller;

import com.example.VictimsService.Dto.DtoVictims;
import com.example.VictimsService.Model.Victims;
import com.example.VictimsService.Service.ServiceVictims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/victims")
public class ControllerVictims {

    @Autowired
    ServiceVictims servivictims;

    @GetMapping("/killers/{victims_id}")
    public DtoVictims getvictimsandkillers(@PathVariable Long victims_id){
       DtoVictims dtoVictims = servivictims.getVictimsAndKillers(victims_id);

        return dtoVictims;
    }

    @PostMapping("/SaveVictims")
    public String saveVictims(@RequestBody Victims victims){
        servivictims.saveVictims(victims);

        return "The new victim has been saved successfully";
    }
}
