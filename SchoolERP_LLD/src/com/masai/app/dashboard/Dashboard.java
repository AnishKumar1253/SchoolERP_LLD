package com.masai.app.dashboard;

import com.masai.app.service.Admin;
import com.masai.app.service.Clerk;
import com.masai.app.service.Teacher;

public class Dashboard {
    private Clerk clerk;
    private Teacher teacher;
    private Admin admin;

    public Dashboard(Clerk clerk, Teacher teacher, Admin admin) {
        this.clerk = clerk;
        this.teacher = teacher;
        this.admin = admin;
    }

    public void showClerkDashboard() {
        System.out.println("Welcome, Clerk!");
        System.out.println("Options:");
        System.out.println("1. Add student");
        System.out.println("2. Update student");
        System.out.println("3. Delete student");
        System.out.println("4. View student details class-wise");
        System.out.println("5. Add fee record and make payment");
        System.out.println("6. View fee record of a particular student");
    }

    public void showTeacherDashboard() {
        System.out.println("Welcome, Teacher!");
        System.out.println("Options:");
        System.out.println("1. View student details class-wise");
        System.out.println("2. View fee records of students class-wise");
    }

    public void showAdminDashboard() {
        System.out.println("Welcome, Admin!");
        System.out.println("Options:");
        System.out.println("1. View total students with details");
        System.out.println("2. View class-wise students with details");
        System.out.println("3. View details of a particular student");
        System.out.println("4. View total sum of fee paid this month");
    }
}

