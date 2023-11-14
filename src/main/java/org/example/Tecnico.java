package org.example;

import java.util.List;
import java.util.Map;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Tecnico {
    private int id;
    private String nombre;
    private List<Especialidad> especialidades;
    private Map<TipoProblema, Integer> tiempoEstimadoPorTipo;
    private MedioNotificacion medioPreferidoNotificacion;

    // Constructor

    public Tecnico(int id, String nombre, List<Especialidad> especialidades, Map<TipoProblema, Integer> tiempoEstimadoPorTipo, MedioNotificacion medioPreferidoNotificacion) {
        this.id = id;
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.tiempoEstimadoPorTipo = tiempoEstimadoPorTipo;
        this.medioPreferidoNotificacion = medioPreferidoNotificacion;
    }
}
