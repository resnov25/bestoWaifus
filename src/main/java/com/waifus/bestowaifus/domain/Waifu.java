package com.waifus.bestowaifus.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Waifu {
    private String nombre;
    private String descripcion;
    private String imagenUrl;
    private String puntacion;


}
