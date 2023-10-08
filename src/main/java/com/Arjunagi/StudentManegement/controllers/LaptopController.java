package com.Arjunagi.StudentManegement.controllers;

import com.Arjunagi.StudentManegement.Models.Laptop;
import com.Arjunagi.StudentManegement.services.LaptopServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopServices laptopServices;

    @PostMapping("/laptop")
    public String addLaptop(@RequestBody Laptop laptop){
        laptopServices.addLaptop(laptop);
        return "laptop added sucessfully";
    }
    @PutMapping("/laptop/id/{laptopId}/student")
    public String linkLaptopToStudent(@PathVariable Integer laptopId, @RequestParam Integer studentId){
        laptopServices.linkLaptopToStudent(laptopId,studentId);
        return "linked sucessfully";
    }
    @GetMapping("/laptops")
    public List<Laptop> getAll(){
        return laptopServices.getAll();
    }
    @DeleteMapping("/laptop/id/{id}")
    public String deleteLaptopById(@PathVariable Integer id){
        return laptopServices.deleteLaptopById(id);
    }
}
