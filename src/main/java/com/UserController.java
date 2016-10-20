package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    //db connection emul
    private UserDAO userDAO = new UserDAOImpl();

    //db connection emulator
    //private MessageDAO messageDAO = new MessageDAOImpl();

    //requestmapping /login
    User login(String name, String password) throws Exception {
        //name , password - create test
        //if user exist - congrats, you are logged in
        //else wronf credentials
        //you must use one jsp
        User curUser = userDAO.get(name, password);

        if (curUser == null)
            throw new Exception("wrong username or password");

        userDAO.setLogin(curUser);

        return curUser;
    }



    void logout(User user) {
        userDAO.setLogin(user);
    }

    //json format

    @RequestMapping("/register")
    ModelAndView register() throws Exception {
        User user = new User(1001,"Roman", Gender.MALE , "123", "Kiev");

        //dbConnection.save(user)
        userDAO.save(user);

       // if (savedUser == null) throw new Exception("user is not saved");

       // user.setLogged(true);

        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping("/users")
    ModelAndView getUsers() {
        List<User> users = userDAO.getAll();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @RequestMapping("/clean")
    ModelAndView clean() {
        userDAO.clean();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", userDAO.getAll());
        return modelAndView;
    }

    void addToFriend(User fromUser, User toUser) throws Exception {
        //bad option
        /*if(fromUser.isLogged()) {
            fromUser.getFriends().add(toUser);
            toUser.getFriends().add(fromUser);
        }
        else {
            throw new Exception("you are is not logged in");
        }*/

        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }


   /* List<Message> getMessages(long userId) {
        //if (!fromUser.isLogged()) throw new Exception("you are is not logged in");
        return messageDAO.getByUserId(userId);
    }


    Map<User, List<Message>> getMessageByUsers(long userId) {
        //TODO make implemetation

        return null;
    }

    List<Message> outboxMessages(long userId) {
        //TODO make implemetation

        return null;
    }

    List<Message> inboxMessages(long userId) {
        //TODO make implemetation

        return null;
    }*/


    //inclass
    //TODO inboxMessages/outboxMessages for time period




}
