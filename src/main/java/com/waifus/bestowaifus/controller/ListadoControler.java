package com.waifus.bestowaifus.controller;

import com.waifus.bestowaifus.domain.Waifu;
import com.waifus.bestowaifus.service.WaifuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ListadoControler {
   @Autowired
   private WaifuService waifuService;

   @RequestMapping()
   public String listarWaifus(Model model){
      List<Waifu> nuevaWaifu = waifuService.buscarWaifus();
      model.addAttribute("Waifus", nuevaWaifu);
      nuevaWaifu.forEach(System.out::println);
      return "listado";
   }

}
