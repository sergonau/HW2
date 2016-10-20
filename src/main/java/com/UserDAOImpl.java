package com;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    //emulates db
    private static List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        users.add(user);
        return user;
    }

    @Override
    public void clean() {
        users.clear();
    }

    @Override
    public void setLogin(User user) {
        if (user.isLogged()) user.setLogged(false);
        else user.setLogged(true);

        users.remove(user);
        users.add(user);
    }

    @Override
    public User get(String name, String psw) {
        for (User user : users) {
            if (user.getName().equals(name) && user.getPassword().equals(psw))
                return user;
        }
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }
}
