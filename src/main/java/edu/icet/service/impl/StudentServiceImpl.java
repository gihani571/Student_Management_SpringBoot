package edu.icet.service.impl;

import edu.icet.dtro.Student;
import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student customer) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public String getVersion() {
        return "1.0.0V";
    }
}