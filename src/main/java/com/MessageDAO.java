package com;


import java.util.List;

public interface MessageDAO {

    Message saveMessage(Message message);

    List<Message> getByUserId(long id);
}
