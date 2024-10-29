package com.example.VictimsService.Service;

import com.example.VictimsService.Dto.DtoVictims;
import com.example.VictimsService.Model.Victims;

public interface IServiceVictims {

    public DtoVictims getVictimsAndKillers(Long victims_id);

    public void saveVictims(Victims victims);


}
