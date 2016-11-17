package com;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDAOImpl extends AbstractDAOImplDB<Users> implements UserDAO {

    @Override
    public Users saveUser(Users user) {
        return save(user);
    }

    @Override
    public List<Users> getAll() {
        String sql = "from Users t";
        Query query = getSession().createQuery(sql);
        return query.list();
    }
}
