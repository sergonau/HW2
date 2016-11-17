package com;

import java.util.Date;

public class Message extends BaseEntity {
    private long id;

    //in real systems string is not used
    //blob clob
    private String msg;

    private UserOld fromUser;
    private UserOld toUser;

    private Date dateSent;
    private Date dateRead;

    private MessageType messageType;

    private boolean isActive;

    public Message(long id, String msg, UserOld fromUser, UserOld toUser) {
        this.id = id;
        this.msg = msg;
        this.fromUser = fromUser;
        this.toUser = toUser;

        this.dateSent = new Date();
        this.isActive = true;
    }


    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public void setDateRead(Date dateRead) {
        this.dateRead = dateRead;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Long getId() {
        return id;
    }

    public String getMsg() {
        return msg;
    }

    public UserOld getFromUser() {
        return fromUser;
    }

    public UserOld getToUser() {
        return toUser;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public Date getDateRead() {
        return dateRead;
    }

    public boolean isActive() {
        return isActive;
    }
}
