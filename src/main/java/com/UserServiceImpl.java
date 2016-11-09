package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /*@Autowired
    private UserDAO userDAO;

    @Override
    public User saveUser(User user) throws Exception {
        User savedUser = userDAO.saveUser(user);

        if (savedUser == null) throw new Exception("user is not saved");
        savedUser.setLogged(true);

        return savedUser;
    }

    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }

    @Override
    public User get(String name, String psw) {
        return userDAO.get(name, psw);
    }

    @Override
    public void clean() {
        userDAO.clean();

    }

    @Override
    public User login(String userName, String psw) {
        //business logic
        User curUser = userDAO.get(userName, psw);

        if (curUser != null) {
            curUser.setLogged(true);
            userDAO.updateUser(curUser);
        }

        return curUser;
    }

    @Override
    public User logout(User user) {
        user.setLogged(false);
        userDAO.updateUser(user);
        return user;
    }

    @Override
    public User makeInactive(User user) {
        user.setActive(false);
        userDAO.updateUser(user);
        return user;
    }

    public void addToFriend() throws Exception {
        //test data create here
        List<User> userList = userDAO.getAll();
        User fromUser = userList.get(0);
        User toUser = userList.get(1);
        //

        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }*/
}
