package com.example.PlacesHalloween.Service;

import com.example.PlacesHalloween.Model.Places;

import java.util.List;

public interface IServicePlaces {

    public List<Places> getallPlacesByIdKillers(Long id_killer);

    public void SavePlaces (Places places);
}
