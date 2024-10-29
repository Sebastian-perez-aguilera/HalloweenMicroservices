package com.example.PlacesHalloween.Controller;


import com.example.PlacesHalloween.Model.Places;
import com.example.PlacesHalloween.Service.IServicePlaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
public class ControllerPlaces {

    @Autowired
    IServicePlaces serviplace;


    @Value("${server.port}")
    private int serverport;

    @GetMapping("/get/{id_killer}")
    public List<Places> GetPlacesByIdKiller(@PathVariable Long id_killer) {
        System.out.println("********* This is port: " + serverport);
        return serviplace.getallPlacesByIdKillers(id_killer);
    }

    @PostMapping("/SavePlace")
    public String save_place(@RequestBody Places place){
        serviplace.SavePlaces(place);

        return "The place has been saved successfully";
    }
}
