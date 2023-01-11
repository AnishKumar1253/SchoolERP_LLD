package com.masai.app.service;
import java.util.List;

import com.masai.app.dao.FeeDao;
import com.masai.app.dao.StudentDao;
import com.masai.app.model.FeeRecord;
import com.masai.app.model.Student;

public class Clerk {
    private StudentDao studentDao;
    private FeeDao feeDao;

    public Clerk(StudentDao studentDao, FeeDao feeDao) {
        this.studentDao = studentDao;
        this.feeDao = feeDao;
    }

    public void createStudent(Student student) {
        studentDao.create(student);
    }

    public Student readStudent(int id) {
        return studentDao.read(id);
    }

    public void updateStudent(Student student) {
        studentDao.update(student);
    }

    public void deleteStudent(int id) {
        studentDao.delete(id);
    }

    public void addFeeRecord(FeeRecord feeRecord) {
        feeDao.create(feeRecord);
    }

    public FeeRecord getFeeRecord(int studentId) {
        return feeDao.read(studentId);
    }

    public void updateFeeRecord(FeeRecord feeRecord) {
        feeDao.update(feeRecord);
    }

    public List<Student> getStudentDetailsByClass(String className) {
        return studentDao.getByClass(className);
    }
}

