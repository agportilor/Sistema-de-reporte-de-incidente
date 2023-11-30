package DAOs;

import Modelos.Tecnico;
import Modelos.TipoProblema;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TecnicoDAO {

    private EntityManager entityManager = null;

    public void create(Tecnico entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Tecnico update(Tecnico entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Tecnico entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Tecnico entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Tecnico findOne(int cuit) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Tecnico.class, cuit);
    }

    public List<Tecnico> findAll() {
        return entityManager.createQuery("from" + Tecnico.class.getName()).getResultList();
    }
}
