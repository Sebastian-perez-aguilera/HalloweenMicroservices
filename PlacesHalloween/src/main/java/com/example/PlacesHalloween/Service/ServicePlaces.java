package com.example.PlacesHalloween.Service;

import com.example.PlacesHalloween.Model.Places;
import com.example.PlacesHalloween.Repository.IRepositoryPlaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicePlaces implements IServicePlaces {

    @Autowired
    IRepositoryPlaces repoplaces;
    @Override
    public List<Places> getallPlacesByIdKillers(Long id_killer) {

        return repoplaces.getPlacesByIdKiller(id_killer);
    }

    @Override
    public void SavePlaces(Places places) {
        repoplaces.save(places);
    }
}
