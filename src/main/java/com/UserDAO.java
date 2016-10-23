package com;

import java.util.List;

public interface UserDAO {
    User saveUser(User user);

    List<User> getAll();

    User get(String name, String psw);

    void clean();

    User updateUser(User user);


}
