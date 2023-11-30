package Repository;

import DAOs.IncidenteDAO;
import Modelos.Incidente;


public class IncidenteRepository {

    private IncidenteDAO dao = new IncidenteDAO();

    public void create(Incidente unIncidente) {
        if(validate(unIncidente))
            dao.create(unIncidente);
    }

    private boolean validate(Incidente unIncidente) {
        //ejecutamos sentencias de validación
        return true;
    }

    public Incidente findOne(int idIncidente) {
        return dao.findOne(idIncidente);
    }
}
