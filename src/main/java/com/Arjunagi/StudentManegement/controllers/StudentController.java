package com.Arjunagi.StudentManegement.controllers;

import com.Arjunagi.StudentManegement.Models.Student;
import com.Arjunagi.StudentManegement.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        studentServices.addStudent(student);
        return "added sucessfully";
    }

    @PutMapping("/student/id/{studentId}/address")
    public String linkStudentToAddress(@PathVariable Integer studentId,@RequestParam Integer addressId){
        studentServices.linkStudentToAddress(studentId,addressId);
        return "linked sucessfully";
    }

    @GetMapping("/students")
    public List<Student> getAll(){
        return studentServices.getAll();
    }
    @DeleteMapping("/student/id/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        studentServices.deleteStudentById(id);
        return "deleted sucessfully";
    }
}
