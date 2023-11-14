package org.example;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TipoProblema {
    private int id;
     private String nombre;
    private int tiempoMaximoResolucion;
    private List<Especialidad> especialidades;

    // Constructor

    public TipoProblema(int id, String nombre, int tiempoMaximoResolucion, List<Especialidad> especialidades) {
        this.id = id;
        this.nombre = nombre;
        this.tiempoMaximoResolucion = tiempoMaximoResolucion;
        this.especialidades = especialidades;
    }
}
