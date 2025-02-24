package edu.icet.service;

import edu.icet.dtro.Student;

import java.util.List;

public interface StudentService {



    public List<Student> getAll();


    String getVersion();

    void addStudent(Student student);
}
