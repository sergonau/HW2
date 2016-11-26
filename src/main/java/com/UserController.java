package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    //test1

    //test

    //db connection emul
    @Autowired
    private UserService userService;

    @Autowired
    private UserDAO userDAO;
    

    /*@RequestMapping("/login")
    ModelAndView login() {
        //test data
        String name = "Roman";
        String password = "123";

        User curUser = userService.login(name, password);

        ModelAndView modelAndView;
        if (curUser == null)
            return new ModelAndView("error");
        else modelAndView = new ModelAndView("welcome");

        modelAndView.addObject("user", curUser);
        modelAndView.addObject("state", "logged in");

        return modelAndView;
    }

    @RequestMapping("/logout")
    ModelAndView logout() {
        //test data
        User user = new User(1001, "Roman", Gender.MALE, "123", "Kiev");

        userService.logout(user);

        return new ModelAndView("home");
    }*/


    @RequestMapping("/register")
    ModelAndView register() throws Exception {
        Users user = new Users("test11@gmail.com", "Denis11", "password", "admin");

        String result = userService.registerUser(user);

        ModelAndView modelAndView = new ModelAndView("welcome");
        modelAndView.addObject("result", result);
        modelAndView.addObject("user", user);
        modelAndView.addObject("state", "registered");
        return modelAndView;
    }

    @RequestMapping("/users")
    ModelAndView getUsers() {
        List<Users> users = userDAO.getAll();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    /*
    @RequestMapping("/clean")
    ModelAndView clean() {
        userService.clean();
        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users", userService.getAll());
        return modelAndView;
    }


    @RequestMapping("/addToFriend")
    void addToFriend() throws Exception {
        userService.addToFriend();
    }

   *//* List<Message> getMessages(long userId) {
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
    }*//*


    //inclass
    //TODO inboxMessages/outboxMessages for time period*/


}
