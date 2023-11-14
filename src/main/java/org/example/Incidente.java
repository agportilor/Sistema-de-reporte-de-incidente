package org.example;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.Clock;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Incidente {
    private int id;
    private Cliente cliente;
    private Servicio servicio;
    private String descripcionProblema;
    private TipoProblema tipoProblema;
    private Tecnico tecnicoAsignado;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaResolucion;
    private EstadoIncidente estado;

    // Constructor

    public Incidente(int id, Cliente cliente, Servicio servicio, String descripcionProblema, TipoProblema tipoProblema, LocalDateTime fechaCreacion, EstadoIncidente estado) {
        this.id = id;
        this.cliente = cliente;
        this.servicio = servicio;
        this.descripcionProblema = descripcionProblema;
        this.tipoProblema = tipoProblema;
        this.fechaCreacion = LocalDateTime.now();
        this.estado = EstadoIncidente.ABIERTO;
    }

    public void asignarTecnico(Tecnico tecnico, LocalDateTime fechaResolucion) {
        this.tecnicoAsignado = tecnico;
        this.fechaResolucion = fechaResolucion;
        this.estado = EstadoIncidente.EN_PROCESO;
        notificarCliente("El incidente ha sido asignado a un técnico y está en proceso.");
    }

    public void marcarComoResuelto(String comentarios) {
        this.estado = EstadoIncidente.RESUELTO;
        notificarCliente("El incidente ha sido resuelto. Comentarios: " + comentarios);
    }

    private void notificarCliente(String mensaje) {
    }
}
