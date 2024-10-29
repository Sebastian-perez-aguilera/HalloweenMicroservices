package com.example.KillersService.Controller;

import com.example.KillersService.Dto.DtoKillers;
import com.example.KillersService.Model.Killers;
import com.example.KillersService.Service.IserviceKillers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/killers")
public class ControllerKillers {

    @Autowired
    IserviceKillers servikillers;

    @Value("${server.port}")
    private int serverport;

    @GetMapping("/getkiller/{victims_id}")
    public List<Killers> GetKillersByVictimsID(@PathVariable Long victims_id){
        System.out.println("*********** This is the port: " + serverport);
       return  servikillers.getallkillers(victims_id);
    }

    @PostMapping("/SaveKiller")
    public String Savekiller(@RequestBody Killers Killer){

        servikillers.savenewkiller(Killer);

        return "The killer has been saved successfully";
    }

    @GetMapping("/getplace/{id_killer}")
    public DtoKillers getAllPlacesById(@PathVariable Long id_killer) {
        return servikillers.GetPlacesByKillers(id_killer);
    }
}
