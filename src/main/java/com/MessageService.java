package com;

import org.springframework.stereotype.Service;

public interface MessageService {
    Message sendMessage(Message message);

    int msgCount(long userId);
}
