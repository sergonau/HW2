package com;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {

    @Override
    public User saveUser(User user) {
        return save(user);
    }

    @Override
    public User updateUser(User user) {
        return update(user);
    }

    @Override
    public void clean() {
        getAll().clear();
    }

    @Override
    public User get(String name, String psw) {
        for (User user : getAll()) {
            if (user.getName().equals(name) && user.getPassword().equals(psw))
                return user;
        }
        return null;
    }

}
