package edu.icet.controller;


import edu.icet.dtro.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/student")
public class StudentController {

    //    http://localhost:8080/api/student/get
    @Autowired
    StudentService service ;
    @GetMapping("/get-all")
    public List<Student> getName(){
        return service.getAll();
    }

    @GetMapping("/version")
    public String getVersion(){
        return service.getVersion();
    }

    @PostMapping("/add-student")

public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

}