package com.waifus.bestowaifus.controller;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.service.AnimeService;
import com.waifus.bestowaifus.service.EstudioService;
import com.waifus.bestowaifus.service.WaifuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WaifuAbmController {

    private final AnimeService animeService;
    private final WaifuService waifuService;
    private final EstudioService estudioService;

    public WaifuAbmController(AnimeService animeService, WaifuService waifuService, EstudioService estudioService) {
        this.animeService = animeService;
        this.waifuService = waifuService;
        this.estudioService = estudioService;
    }

    @RequestMapping("/waifuAlta")
    public String mostrarFormAlta(Model model){
        model.addAttribute("estudio", estudioService.buscarTodos());
        model.addAttribute("anime", animeService.buscarTodos());
        model.addAttribute("waifu", new Waifu());
        return "altaWaifu";
    }

    @PostMapping("/waifus/guardar")
    public String guardar(Waifu waifu){
        waifuService.guardar(waifu);
        return "redirect:/";
    }

}
