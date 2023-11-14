package org.example;

import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cliente {
    private int id;
    private String razonSocial;
    private String cuit;
    private List<Servicio> serviciosContratados;

    // Constructor

    public Cliente(int id, String razonSocial, String cuit, List<Servicio> serviciosContratados) {
        this.id = id;
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.serviciosContratados = serviciosContratados;
    }
}
