package com.masai.app.service;
import java.time.LocalDate;
import java.util.List;

import com.masai.app.dao.FeeDao;
import com.masai.app.dao.StudentDao;
import com.masai.app.model.Student;

public class Admin {
    private StudentDao studentDao;
    private FeeDao feeDao;

    public Admin(StudentDao studentDao, FeeDao feeDao) {
        this.studentDao = studentDao;
        this.feeDao = feeDao;
    }

    public List<Student> getAllStudents() {
        return studentDao.readAll();
    }

    public List<Student> getStudentsByClass(String className) {
        return studentDao.getByClass(className);
    }

    public Student getStudentDetails(int id) {
        return studentDao.read(id);
    }

    public float getTotalFeesPaidThisMonth() {
        LocalDate now = LocalDate.now();
        int currentMonth = now.getMonthValue();
        int currentYear = now.getYear();
        return ((FeeDao) feeDao).getTotalFeesPaidThisMonth(currentMonth, currentYear);
    }
}

