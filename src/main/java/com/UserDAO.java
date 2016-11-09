package com;

import java.util.List;

public interface UserDAO {
    Users saveUser(Users user);

    //Users updateUser(Users user);

    List<Users> getAll();

    //Users get(String name, String psw);

    //void clean();
}
