package com;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class UserDAOImpl extends AbstractDAOImplDB<Users> implements UserDAO {

    @Override
    public Users saveUser(Users user) {
        return save(user);
    }

    @Override
    public Users getByEmailOrUserName(String email, String userName) {
        //String requestToDb = "select * from Users where email = 'test@test.com' or user_name = 'denis008'";
        String requestToDb = "from Users t where t.email = :emailParam or t.userName = :userNameParam";
        Query query = getSession().createQuery(requestToDb);
        query.setParameter("emailParam", email);
        query.setParameter("userNameParam", userName);

        //another option
      /*  Map<String, Object> map = new HashMap<>();
        map.put("emailParam", email);
        map.put("userNameParam", userName);
        for (String name : map.keySet()) {
            query.setParameter(name, map.get(name));
        }*/
        return (Users) query.uniqueResult();
    }

    @Override
    public List<Users> getAll() {
        String sql = "from Users t";
        Query query = getSession().createQuery(sql);
        return query.list();
    }
}
