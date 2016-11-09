package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Main {

    @Autowired
    static UserDAO userDAO;

    public static void main(String[] args) {

        List<Users> usersList = userDAO.getAll();

    }
}
