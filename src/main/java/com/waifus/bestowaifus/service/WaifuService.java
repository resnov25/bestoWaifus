package com.waifus.bestowaifus.service;

import com.waifus.bestowaifus.domain.Waifu;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class WaifuService {
    @Autowired
    public List<Waifu> buscarWaifus() {
        List<Waifu> waifu = new ArrayList<>();

        Waifu nuevaWaifu = new Waifu();
        nuevaWaifu.setNombre("Nino Nakano");
        nuevaWaifu.setDescripcion("Nino Nakano (中なか野の 二に乃の, Nakano Nino ?) es la segunda hermana de las quintillizas Nakano. Por lo general, actúa como la madre de la familia, cocina para ellas y se ocupa de sus necesidades médicas. Entre las cinco hermanas, ella es la que tiene la mayor hostilidad hacia Fuutarou Uesugi y a menudo se rebela contra él al principio de la serie.");
        nuevaWaifu.setImagenUrl("https://i.pinimg.com/originals/5c/dd/df/5cdddfde3398f513a59c07cc298247c2.jpg");
        nuevaWaifu.setPuntacion("Waifumetro: 88");
        waifu.add(nuevaWaifu);

        nuevaWaifu = new Waifu();
        nuevaWaifu.setNombre("Nefer Pitou");
        nuevaWaifu.setDescripcion("Neferpitou (ネフェルピトー,  Neferupitō), apodado Pitou, fue una hormiga quimera con aspecto gato-humanoide. Fue uno de los Guardias Reales del rey Meruem, y el mayor de sus hermanos.");
        nuevaWaifu.setImagenUrl("https://static.wikia.nocookie.net/hunterxhunter/images/2/20/109_-_Neferpitou_portrait.png/revision/latest?cb=20131218034405");
        nuevaWaifu.setPuntacion("Waifumetro: 85");
        waifu.add(nuevaWaifu);

        nuevaWaifu = new Waifu();
        nuevaWaifu.setNombre("Mai Sakurajima");
        nuevaWaifu.setDescripcion("Mai Sakurajima (桜島 麻衣, Sakurajima Mai ?) es la principal protagonista femenina de Seishun Buta Yarō. Ella es una actriz/modelo notable y va en tercer año en la preparatoria Minegahara al igual que Sakuta Azusagawa.");
        nuevaWaifu.setImagenUrl("https://pm1.narvii.com/7486/6d2b78cbbf3a0fd92082e7e8a20108b6ce11ad2fr1-1006-1268v2_hq.jpg");
        nuevaWaifu.setPuntacion("Waifumetro: 92");
        waifu.add(nuevaWaifu);

        nuevaWaifu = new Waifu();
        nuevaWaifu.setNombre("Nejire Hado");
        nuevaWaifu.setDescripcion("Nejire Hado (波は動どうねじれ Hadō Nejire ?) también conocida como Nejire Chan (ネジレちゃん Nejirechan ?), es una estudiante de tercer año en la Academia U.A. y es parte de los Tres Grandes.");
        nuevaWaifu.setImagenUrl("https://i.pinimg.com/originals/c4/17/a8/c417a807b7183c22dae13164ba720f06.jpg");
        nuevaWaifu.setPuntacion("Waifumetro: 90");
        waifu.add(nuevaWaifu);


        return waifu;
    }
}
