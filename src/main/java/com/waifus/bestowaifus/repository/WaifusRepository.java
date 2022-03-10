package com.waifus.bestowaifus.repository;

import com.waifus.bestowaifus.domain.Waifu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WaifusRepository extends JpaRepository <Waifu, Integer>{

    @Query("select v from Waifu v order by v.nombre")
    List<Waifu> buscarTodos();

    @Query("FROM Waifu V WHERE V.estudio.id = ?1 ORDER BY v.nombre")
    List<Waifu> buscarPorEstudio(int estudioId);

}
