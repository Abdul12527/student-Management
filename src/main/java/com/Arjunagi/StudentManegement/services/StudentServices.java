package com.Arjunagi.StudentManegement.services;

import com.Arjunagi.StudentManegement.Models.Address;
import com.Arjunagi.StudentManegement.Models.Student;
import com.Arjunagi.StudentManegement.repositories.IAddressRepo;
import com.Arjunagi.StudentManegement.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    @Autowired
    IStudentRepo studentRepo;
    @Autowired
    IAddressRepo addressRepo;
    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void linkStudentToAddress(Integer studentId, Integer addressId) {
        Student student =studentRepo.findById(studentId).orElseThrow();
        Address address=addressRepo.findById(addressId).orElseThrow();
        student.setAddress(address);
        studentRepo.save(student);
    }

    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    public void deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
    }
}
