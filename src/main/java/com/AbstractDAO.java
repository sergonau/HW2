package com;

import java.util.List;

public interface AbstractDAO<T extends BaseEntity> {
    T save(T t);

    T update(T t);

    T delete(T t);

    T findById(long id);

    List<T> getAll();
}
