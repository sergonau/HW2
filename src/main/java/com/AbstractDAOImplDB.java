package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
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
