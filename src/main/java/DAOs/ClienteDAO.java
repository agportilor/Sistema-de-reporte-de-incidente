package DAOs;

import Modelos.Cliente;
import Modelos.Incidente;
import resource.ConnectionManager;
import resource.DBConfig;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.client.Client;
import java.util.List;

public class ClienteDAO {

    private EntityManager entityManager = null;

    public void create(Cliente entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(entity);
        tx.commit();
    }

    public Cliente update(Cliente entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Cliente entityMerged = entityManager.merge(entity);
        tx.commit();
        return entityMerged;
    }

    public void delete(Cliente entity) {
        entityManager = DBConfig.getEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.remove(entity);
        tx.commit();
    }

    public Incidente findOne(int cuit) {
        entityManager = DBConfig.getEntityManager();
        return entityManager.find(Incidente.class, cuit);
    }

    public List<Incidente> findAll() {
        return entityManager.createQuery("from" + Cliente.class.getName()).getResultList();
    }
}

