package DAOs;

import Modelos.Especialidad;
import Modelos.Problema;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ProblemaDAO {

    private EntityManager entityManager = null;

    public void create(Problema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Problema update(Problema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Problema entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Problema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Problema findOne(int idProblema) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Problema.class, idProblema);
    }

    public List<Especialidad> findAll() {
        return entityManager.createQuery("from" + Especialidad.class.getName()).getResultList();
    }
}
