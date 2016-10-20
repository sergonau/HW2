package com;


public class MessagesController {
    private UserDAO userDAO = new UserDAOImpl();

    private MessageDAO messageDAO = new MessageDAOImpl();


    Message sendMessage(User fromUser, User toUser, String msg) throws Exception {
        if (!fromUser.isLogged()) throw new Exception("you are is not logged in");

        Message message = new Message(101, msg, fromUser, toUser);

       // messageDAO.save(message);

        return message;
    }

    //getUserMessages - size - count messages
    //getMessages() {
    // User user = new User(1001,"Roman", Gender.MALE , "123", "Kiev");
    //create test messages
    //add messages to user
    // }

    //getUserMessages - show 1 messages
    //getMessages() {
    // User user = new User(1001,"Roman", Gender.MALE , "123", "Kiev");
    //create test messages
    //add messages to user
    // }


    public MessageDAO getMessageDAO(User user) {
        return messageDAO;
    }
}
