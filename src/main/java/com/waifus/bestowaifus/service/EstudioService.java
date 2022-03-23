package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Estudio;
import com.waifus.bestowaifus.repository.EstudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudioService {

    private final EstudioRepository estudioRepository;

    public EstudioService(EstudioRepository estudioRepository) {
        this.estudioRepository = estudioRepository;
    }

    public List<Estudio> buscarTodos(){
        return estudioRepository.findAll();
    }
}
