package com;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {
    //make six methods with generics
    List<T> list = new ArrayList<>();

    public AbstractDAOImpl() {
    }

    @Override
    public T save(T t) {
        return null;
    }

   /* @Override
    public T findById(long id) {
        *//**//*for (T t : list) {
            if (t.getId() == id) return t;
        }
        return null;*//**//*
        //return id;
    }*/



    //

    //

    //

    //

    //

}
