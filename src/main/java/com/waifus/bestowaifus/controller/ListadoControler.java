package com.waifus.bestowaifus.controller;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.service.WaifuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ListadoControler {
   @Autowired
   private WaifuService waifuService;

   @RequestMapping("/")
   public String listarWaifus(Model model){
      List<Waifu> nuevaWaifu = waifuService.buscarWaifus();
      model.addAttribute("Waifus", nuevaWaifu);
      return "listado";
   }
   @RequestMapping("/waifusPorEstudio")
   public String listarWaifusPorEstudio(int estudioId, Model model){
      List<Waifu> waifu =waifuService.buscarPorEstudio(estudioId);
      model.addAttribute("waifus", waifu);
      return "listado";
   }
   @RequestMapping("/buscar")
   public String buscar(@RequestParam("q")String consulta, Model model){
      List<Waifu> waifu = waifuService.buscar(consulta);
      model.addAttribute("waifus", waifu);
      return "listado";
   }

}
