package DAOs;

import Modelos.Servicio;
import Modelos.Tecnico;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ServicioDAO {

    private EntityManager entityManager = null;

    public void create(Servicio entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Servicio update(Servicio entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Servicio entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Servicio entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Servicio findOne(int idServicio) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Servicio.class, idServicio);
    }

    public List<Servicio> findAll() {
        return entityManager.createQuery("from" + Servicio.class.getName()).getResultList();
    }
}
