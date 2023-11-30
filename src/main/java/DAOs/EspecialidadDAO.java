package DAOs;

import Modelos.Especialidad;
import Modelos.Servicio;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class EspecialidadDAO {

    private EntityManager entityManager = null;

    public void create(Especialidad entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Especialidad update(Especialidad entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Especialidad entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Especialidad entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Especialidad findOne(int idEspecialidad) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Especialidad.class, idEspecialidad);
    }

    public List<Especialidad> findAll() {
        return entityManager.createQuery("from" + Especialidad.class.getName()).getResultList();
    }
}
