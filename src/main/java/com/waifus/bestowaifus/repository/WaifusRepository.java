package com.waifus.bestowaifus.repository;

import com.waifus.bestowaifus.domain.Waifu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WaifusRepository extends JpaRepository <Waifu, Integer>{

    @Query("select v from Waifu v order by v.nombre")
    List<Waifu> buscarTodos();

    //@Query("select v from Waifu v where v.estudio.id = ?1")
    List<Waifu> findByEstudio_Id(int estudioId);

    //@Query("from Waifu v where v.nombre like %?1%")

    List<Waifu> findByNombreContaining(String consulta);

}
