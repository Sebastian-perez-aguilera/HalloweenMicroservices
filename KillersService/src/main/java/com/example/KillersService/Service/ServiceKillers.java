package com.example.KillersService.Service;

import com.example.KillersService.Dto.DtoKillers;
import com.example.KillersService.Dto.Dtoplaces;
import com.example.KillersService.Model.Killers;
import com.example.KillersService.Repository.ApiPlaces;
import com.example.KillersService.Repository.IRepositoryKillers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceKillers implements IserviceKillers{

    @Autowired
    private IRepositoryKillers repokillers;

    @Autowired
    private ApiPlaces apiplace;

    @Override
    public List<Killers> getallkillers(Long victims_id) {
        return  repokillers.getKillersByVictimsId(victims_id);
    }

    @Override
    public void savenewkiller(Killers killer) {
        repokillers.save(killer);
    }

    @Override
    public DtoKillers GetPlacesByKillers(Long id_killer) {

        Killers killer = repokillers.findById(id_killer).orElse(null);

        List<Dtoplaces> dtoplace = apiplace.GetPlaceByidKillers(id_killer);

        assert killer != null;
        return new DtoKillers(killer.getId_killer(), killer.getName(),killer.getAge(),killer.getHeight(),killer.getFavorite_weapon(),killer.getVictims_id(),dtoplace);


    }
}
