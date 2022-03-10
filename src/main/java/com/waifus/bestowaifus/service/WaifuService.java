package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.repository.WaifusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class WaifuService {

    private final WaifusRepository waifusRepository;

    public WaifuService(WaifusRepository waifusRepository) {
        this.waifusRepository = waifusRepository;
    }

    @Autowired
    public List<Waifu> buscarWaifus() {
        return waifusRepository.buscarTodos();
    }

    public List<Waifu>buscarPorEstudio(int estudioId){
        return waifusRepository.buscarPorEstudio(estudioId);
    }
}
