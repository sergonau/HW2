package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageDAO messageDAO;


    @Override
    public Message sendMessage(Message message) {
        return messageDAO.saveMessage(message);
    }

    @Override
    public int msgCount(long userId) {
        return messageDAO.getByUserId(userId).size();
    }
}
