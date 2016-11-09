package com;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl extends AbstractDAOImplDB<Users> implements UserDAO {

    @Override
    public Users saveUser(Users user) {
        return save(user);
    }

    @Override
    public List<Users> getAll() {
        String sql = "SELECT * FROM USERS";
        Query query = getSession().createQuery(sql);
        return query.list();
    }
}
