package Controllers;

import Modelos.Incidente;
import Repository.IncidenteRepository;

public class ControllerInicializar {

    public static void inicializar() {

        IncidenteRepository incidenteRepository = new IncidenteRepository();

        incidenteRepository.create(new Incidente("Primer Incidente"));
        incidenteRepository.create(new Incidente("Segundo Incidente"));
        incidenteRepository.create(new Incidente("Tercer Incidente"));


    }

}
