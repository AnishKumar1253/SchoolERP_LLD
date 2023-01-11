package com.masai.app.dao;

import java.util.List;

import com.masai.app.model.Student;

public interface StudentDao {
    void create(Student student);
    Student read(int id);
    void update(Student student);
    void delete(int id);
    List<Student> getByClass(String className);
	List<Student> readAll();
}
