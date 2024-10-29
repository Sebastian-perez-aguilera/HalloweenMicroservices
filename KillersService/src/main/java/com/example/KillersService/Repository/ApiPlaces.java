package com.example.KillersService.Repository;

import com.example.KillersService.Dto.Dtoplaces;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("PlacesHalloween")
public interface ApiPlaces {

    @GetMapping("/places/get/{id_killer}")
    List<Dtoplaces> GetPlaceByidKillers(@PathVariable ("id_killer") Long id_killer);

}
