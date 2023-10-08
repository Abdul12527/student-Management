package com.Arjunagi.StudentManegement.services;

import com.Arjunagi.StudentManegement.Models.Laptop;
import com.Arjunagi.StudentManegement.Models.Student;
import com.Arjunagi.StudentManegement.repositories.ILaptopRepo;
import com.Arjunagi.StudentManegement.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServices {
    @Autowired
    ILaptopRepo laptopRepo;
    @Autowired
    IStudentRepo studentRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public void linkLaptopToStudent(Integer laptopId, Integer studentId) {
        Laptop laptop=laptopRepo.findById(laptopId).orElseThrow();
        Student student=studentRepo.findById(studentId).orElseThrow();
        laptop.setStudent(student);
        laptopRepo.save(laptop);
    }

    public String deleteLaptopById(Integer id) {
        try {
            laptopRepo.deleteById(id);
            return "deleted sucessfully";
        }catch (Exception e){
            return e.toString();
        }
    }

    public List<Laptop> getAll() {
        return laptopRepo.findAll();
    }
}
