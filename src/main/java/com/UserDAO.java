package com;

import java.util.List;

public interface UserDAO {
    Users saveUser(Users user);

    //Users updateUser(Users user);

    List<Users> getAll();

    Users getByEmailOrUserName(String email, String userName);

    //Users get(String name, String psw);

    //void clean();
}
