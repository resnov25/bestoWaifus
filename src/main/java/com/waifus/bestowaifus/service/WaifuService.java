package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.repository.WaifusRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service

public class WaifuService {

    private final WaifusRepository waifusRepository;

    public WaifuService(WaifusRepository waifusRepository) {
        this.waifusRepository = waifusRepository;
    }

    public List<Waifu> buscarWaifus() {
        return waifusRepository.findAllBy();
    }

    public List<Waifu>buscarPorEstudio(int estudioId){
        return waifusRepository.findByEstudio_Id(estudioId);
    }

    public List<Waifu>buscar(String consulta){
        return waifusRepository.findByNombreContaining(consulta);
    }

    public List<Waifu>buscarPorAnime(int animeId){
        return waifusRepository.findByAnime_Id(animeId);
    }


    public Waifu guardar(Waifu waifu) {
        return waifusRepository.save(waifu);
    }
}

