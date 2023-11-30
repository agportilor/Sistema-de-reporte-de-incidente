package Modelos;

import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Table(name="Cliente")
@Data
@Entity
public class Cliente implements Serializable {

    @Id
    @Column(name = "cuit", length = 11, nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cuit;

    @Column(name = "razonSocial", nullable = false)
    public RazonSocial razonSocial;
    @Column(name = "nombre", nullable = false)
    public String nombreCompleto;
    @Column(name = "numeroDeTelefono", nullable = false, unique = true)
    public String numDeTelefono;
    @Column(name = "email", nullable = false, unique = true)
    public String email;
    @Column(name = "MedioNotificacion", nullable = false)
    public MedioNotificacion medioNotificacion;

    //Clase Razon Social necesaria
        public enum RazonSocial {
            juridica, fisica
        }

    //ANOTACIONES

    @OneToMany(mappedBy = "cliente")
    private List<Suscripcion> suscripcion;

    public Cliente() {

    }

}

