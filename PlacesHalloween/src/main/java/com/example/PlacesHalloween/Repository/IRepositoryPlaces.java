package com.example.PlacesHalloween.Repository;

import com.example.PlacesHalloween.Model.Places;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepositoryPlaces extends JpaRepository<Places, Long> {

    @Query("SELECT p FROM Places p WHERE p.id_killer = :id_killer")
    List<Places> getPlacesByIdKiller(@Param("id_killer") Long id_killer);
}
