package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Anime;
import com.waifus.bestowaifus.domain.Estudio;
import com.waifus.bestowaifus.repository.AnimeRepository;
import com.waifus.bestowaifus.repository.EstudioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    public List<Anime> buscarTodos(){
        return animeRepository.findAll();
    }
}
