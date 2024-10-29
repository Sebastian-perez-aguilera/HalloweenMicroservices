package com.example.VictimsService.Repository;

import com.example.VictimsService.Dto.DtoKillers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="KillersService")
public interface FeignKillers {

    @GetMapping("/killers/getkiller/{victims_id}")
    List<DtoKillers> dtovictims (@PathVariable ("victims_id")Long victims_id);

}
