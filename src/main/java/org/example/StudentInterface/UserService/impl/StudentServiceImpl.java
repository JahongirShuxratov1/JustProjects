package org.example.StudentInterface.UserService.impl;

import org.example.StudentInterface.Student;
import org.example.StudentInterface.UserService.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StudentServiceImpl implements StudentService {
    private List<Student> users = new ArrayList<>();

    @Override
    public boolean create(String name, int id, int grade) {
        if (users.get(id) == null) {
            Student student = new Student(id, grade, name);
            users.add(student);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(id).getId() == id) {
                users.remove(users.get(id));
                return true;
            }
        }
        return false;
    }

    @Override
    public Student update(String name, int id, int grade) {
        Student student = new Student(id, grade, name);

        return student;
    }

    @Override
    public Student get(int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(id).getId() == id) {

                return users.get(id);
            }
        }
        throw new RuntimeException();
    }

    @Override
    public List<Student> getAll() {
        return users;
    }
}
