package Modelos;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Data
@Entity
@Table(name = "Incidente")
public class Incidente {

    @Id
    @Column(name = "idIncidente", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;

    @Column (name = "title", length = 255, nullable = false)
    private String title;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucion;
    @Enumerated (EnumType.STRING)
    private EstadoIncidente estadoIncidente;
    @Column (name = "complejo", nullable = false)
    private boolean complejo;
    @Column (name = "cerrado", nullable = false)
    private boolean cerrado;



    @ManyToOne
    @JoinColumn(name = "fk_tecnico", referencedColumnName = "cuit")
    private Tecnico tecnico;

    @ManyToOne
    @JoinColumn(name = "fk_servicio", referencedColumnName = "id")
    private Servicio servicio;

    @OneToMany(mappedBy = "incidente")
    private List<Problema> problema;

    public Incidente(String title) {
        this.title = title;
    }

}