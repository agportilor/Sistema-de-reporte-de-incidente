package DAOs;

import Modelos.Especialidad;
import Modelos.Problema;
import Modelos.Suscripcion;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class SuscripcionDAO {

    private EntityManager entityManager = null;

    public void create(Suscripcion entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Suscripcion update(Suscripcion entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Suscripcion entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Suscripcion entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Suscripcion findOne(int idSuscripcion) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Suscripcion.class, idSuscripcion);
    }

    public List<Suscripcion> findAll() {
        return entityManager.createQuery("from" + Suscripcion.class.getName()).getResultList();
    }
}
