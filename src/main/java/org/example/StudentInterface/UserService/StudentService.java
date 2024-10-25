package org.example.StudentInterface.UserService;

import org.example.StudentInterface.Student;

import java.util.List;

public interface StudentService {
    boolean create (String name,int id, int grade);
    boolean delete (int id);
    Student update (String name,int id, int grade);
    Student get (int id);
     List<Student> getAll() ;





}
