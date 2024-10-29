package com.example.KillersService.Service;

import com.example.KillersService.Dto.DtoKillers;
import com.example.KillersService.Model.Killers;

import java.util.List;

public interface IserviceKillers {

    public List<Killers> getallkillers(Long victims_id);

    public void savenewkiller(Killers killer);

     public DtoKillers GetPlacesByKillers(Long id_killer);
}
