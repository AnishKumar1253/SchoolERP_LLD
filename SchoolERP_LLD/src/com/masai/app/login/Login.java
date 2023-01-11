package com.masai.app.login;

import com.masai.app.dao.UserDao;
import com.masai.app.model.User;

public class Login {
    private UserDao userDao;
    public Login(UserDao userDao) {
        this.userDao = userDao;
    }

    public User login(String username, String password) {
        User user = userDao.getByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("User " + username + " logged in");
            return user;
        } else {
            return null;
        }
    }
}
