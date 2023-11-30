package Modelos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
public class Servicio {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int idServicio;


        @OneToMany(mappedBy = "servicio")
        private List<Suscripcion> suscripcionList;

}
