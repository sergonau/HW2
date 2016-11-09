package com;

import org.hibernate.Query;
import org.hibernate.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class AbstractDAOImplDB<T extends BaseEntity> implements AbstractDAO<T> {

    @PersistenceContext
    EntityManager entityManager;

    public AbstractDAOImplDB() {

    }

    @Override
    public T save(T t) {
        entityManager.persist(t);
        return t;
    }

    public Session getSession() {
        return entityManager.unwrap(Session.class);
    }
}
