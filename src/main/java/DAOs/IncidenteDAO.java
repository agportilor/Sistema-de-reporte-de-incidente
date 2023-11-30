package DAOs;

import Modelos.Incidente;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.text.html.parser.Entity;
import java.util.List;

public class IncidenteDAO {

    private EntityManager entityManager = null;

    public void create(Incidente entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
            entityManager.persist(entity);
        tx.commit();
    }

    public Incidente update(Incidente entity) {
         entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
            Incidente entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Incidente entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Incidente findOne(int idIncidente) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Incidente.class, idIncidente);
    }

    public List<Incidente> findAll() {
        return entityManager.createQuery("from" + Incidente.class.getName()).getResultList();
    }
}
