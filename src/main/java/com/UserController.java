package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {
    //db connection emul
    @Autowired
    private UserService userService;

    @Autowired
    private UserDAO userDAO;


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
