package com;

import java.util.List;

public interface UserDAO {
    User save(User user);

    List<User> getAll();

    User get(String name, String psw);

    void clean();

    void setLogin(User user);

    //User delete(User user);

    //User makeInactive(User user);

    //User update(User user);
}
