package edu.icet.service.impl;

import edu.icet.dtro.Student;
import edu.icet.service.StudentService;

import java.util.List;

public class StudentVersionImplV2 implements StudentService {


    @Override
    public void addStudent(Student students) {

    }

    @Override
public List<Student> getAll() {
        return null;
    }

    @Override
    public String getVersion() {
        return "2.0.0V";
    }  }

