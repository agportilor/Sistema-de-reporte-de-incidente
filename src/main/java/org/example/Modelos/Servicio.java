package org.example.Modelos;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Servicio {
    private int id;
    private String nombre;

    // Constructor

    public Servicio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
