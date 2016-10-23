package com;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MessagesController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private UserDAO userDAO;


    @RequestMapping("/sendMessage")
    ModelAndView sendMessage() {
        List<User> userList = userDAO.getAll();
        User fromUser = userList.get(0);
        User toUser = userList.get(1);
        Message message = new Message(101, "Привет!! тест", fromUser, toUser);

        if (!fromUser.isLogged()) {
            ModelAndView modelAndView = new ModelAndView("error");
            modelAndView.addObject("error", "you are is not logged in");
            return modelAndView;
        }

        messageService.sendMessage(message);

        ModelAndView modelAndView = new ModelAndView("text");
        modelAndView.addObject("text", "message was sent");
        return modelAndView;
    }

    @RequestMapping("/messagesCount")
    ModelAndView getMessages() {
        User user = new User(1001, "Roman", Gender.MALE, "123", "Kiev");

        ModelAndView modelAndView = new ModelAndView("text");
        modelAndView.addObject("text", messageService.msgCount(user.getId()));

        return modelAndView;
    }

}
