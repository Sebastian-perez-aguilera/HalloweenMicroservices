package com.example.KillersService.Repository;

import com.example.KillersService.Model.Killers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface IRepositoryKillers extends JpaRepository<Killers, Long> {

    @Query("SELECT k FROM Killers k WHERE k.victims_id = :victims_id")
    List<Killers> getKillersByVictimsId(Long victims_id);
}
