package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.repository.WaifusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Service

public class WaifuService {

    private final WaifusRepository waifusRepository;

    public WaifuService(WaifusRepository waifusRepository) {
        this.waifusRepository = waifusRepository;
    }

    public List<Waifu> buscarWaifus() {
        return waifusRepository.buscarTodos();
    }

    public List<Waifu>buscarPorEstudio(int estudioId){
        return waifusRepository.findByEstudio_Id(estudioId);
    }

    public List<Waifu>buscar(String consulta){
        return waifusRepository.findByNombreContaining(consulta);
    }
}
