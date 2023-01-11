package com.masai.app;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.masai.app.dao.FeeDao;
import com.masai.app.dao.StudentDao;
import com.masai.app.dao.UserDao;
import com.masai.app.dashboard.Dashboard;
import com.masai.app.login.Login;
import com.masai.app.model.User;
import com.masai.app.service.Admin;
import com.masai.app.service.Clerk;
import com.masai.app.service.Teacher;

public class Main {
    public static void main(String[] args) {
        // load properties file
        Properties prop = new Properties();
        InputStream input = new FileInputStream("config.properties");
        prop.load(input);

        // read the credentials
        String url = prop.getProperty("db.url");
        String username = prop.getProperty("db.username");
        String password = prop.getProperty("db.password");

        // create a connection
        Connection connection = DriverManager.getConnection(url, username, password);

        UserDao userDao = new UserDao(connection);
        StudentDao studentDao = new StudentDao(connection);
        FeeDao feeDao = new FeeDao(connection);
        Login login = new Login(userDao);
        Clerk clerk = new Clerk(studentDao, feeDao);
        Teacher teacher = new Teacher(studentDao);
        Admin admin = new Admin(studentDao, feeDao);
        Dashboard dashboard = new Dashboard(clerk, teacher, admin);

        // login user
        String enteredUsername = "user1";
        String enteredPassword = "password1";
        User user = login.login(enteredUsername, enteredPassword);
        if (user != null) {
            String role = user.getRole();
            if (role.equals("clerk")) {
                dashboard.showClerkDashboard();
            } else if (role.equals("teacher")) {
                dashboard.showTeacherDashboard();
            } else if (role.equals("admin")) {
                dashboard.showAdminDashboard();
            } else {
                System.out.println("Invalid role for user: " + enteredUsername);
            }
        } else {
            System.out.println("Invalid login credentials");
        }
    }
}

