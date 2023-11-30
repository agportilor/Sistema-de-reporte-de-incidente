package Modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

    @Data @Getter
    @Setter
    @AllArgsConstructor
    @Entity
    @Table(name="Suscripcion")

    public class Suscripcion {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;

        @ManyToOne
        @JoinColumn(name = "cliente_cuit")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "servicio_id")
        private Servicio servicio;

        @Column(name = "date_of_creation")
        private Date dateOfCreation;

}
