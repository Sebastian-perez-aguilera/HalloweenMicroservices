package com.example.VictimsService.Repository;

import com.example.VictimsService.Model.Victims;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryVictims extends JpaRepository<Victims, Long> {

}
