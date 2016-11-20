package com;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MESSAGES")
public class Message extends BaseEntity {
    private long id;
    private String msg;

    private Users fromUser;
    private Users toUser;

    private Date dateSent;
    private Date dateRead;

    private boolean isActive;

    public Message(long id, String msg, Users fromUser, Users toUser) {
        this.id = id;
        this.msg = msg;
        this.fromUser = fromUser;
        this.toUser = toUser;

        this.dateSent = new Date();
        this.isActive = true;
    }


    // @ManyToOne
    //@JoinColumn(name = "FROM_USER_ID")

    //@OneToMany(targetEntity = Article.class, mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //public List<Article> getArticles() {
    //    return articles;
    //}

    //@OneToOne
    //@JoinColumn(name = "FROM_USER_ID")
    //public Users getUser() {
    //     return user;
    // }


    public Long getId() {
        return id;
    }

    @Column(name = "DESCRIPTION")
    public String getMsg() {
        return msg;
    }

    @Column(name = "DATE_SENT")
    public Date getDateSent() {
        return dateSent;
    }

    @Column(name = "DATE_READ")
    public Date getDateRead() {
        return dateRead;
    }

    @Column(name = "IS_ACTIVE")
    public boolean isActive() {
        return isActive;
    }

    public Users getFromUser() {
        return fromUser;
    }

    public Users getToUser() {
        return toUser;
    }
}
