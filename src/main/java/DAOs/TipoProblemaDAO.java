package DAOs;

import Modelos.Incidente;
import Modelos.TipoProblema;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TipoProblemaDAO {

    private EntityManager entityManager = null;

    public void create(TipoProblema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public TipoProblema update(TipoProblema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        TipoProblema entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(TipoProblema entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public TipoProblema findOne(int idTipoProblema) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(TipoProblema.class, idTipoProblema);
    }

    public List<TipoProblema> findAll() {
        return entityManager.createQuery("from" + TipoProblema.class.getName()).getResultList();
    }
}

