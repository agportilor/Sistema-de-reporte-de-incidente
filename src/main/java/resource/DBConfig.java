package resource;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBConfig {

        static EntityManagerFactory factory = null;

        public static EntityManager getEntityManager(){
                if(factory == null)
                        factory = Persistence.createEntityManagerFactory("SistemadeReportedeIncidentes");
                EntityManager manager = factory.createEntityManager();
                return manager;
        }
}