package com.example.VictimsService.Service;


import com.example.VictimsService.Dto.DtoKillers;
import com.example.VictimsService.Dto.DtoVictims;
import com.example.VictimsService.Model.Victims;
import com.example.VictimsService.Repository.FeignKillers;
import com.example.VictimsService.Repository.IRepositoryVictims;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceVictims implements IServiceVictims{

    @Autowired
    IRepositoryVictims repovictims;
    @Autowired
    FeignKillers feignkillers;

    @Override
    @CircuitBreaker(name="KillersService", fallbackMethod = "fallbackgetVictimsAndKillers")
    @Retry(name= "KillersService")
    public DtoVictims getVictimsAndKillers(Long victims_id) {
        Victims victim = repovictims.findById(victims_id).orElse(null);
        List<DtoKillers> dtoKillers = feignkillers.dtovictims(victims_id);
        assert victim != null;

        return new DtoVictims(victim.getVictims_id(),victim.getName(), victim.getEdad(), victim.getDni(), dtoKillers);
    }

    public DtoVictims fallbackgetVictimsAndKillers (Throwable throwable){
         return new DtoVictims(99999L,"Fallido", "Fallido","Fallido",null);

    }

    @Override
    public void saveVictims(Victims victims) {
        repovictims.save(victims);
    }
}
