package com.Arjunagi.StudentManegement.controllers;

import com.Arjunagi.StudentManegement.Models.Course;
import com.Arjunagi.StudentManegement.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseServices courseServices;

    @PostMapping("/course")
    public String addCourse(@RequestBody Course course){
        courseServices.addCourse(course);
        return "course added sucessfully";
    }
    @PutMapping("/course/id/{courseId}")
    public String addStudentsToCourse(@PathVariable Integer courseId,@RequestParam List<Integer> studentIds){
        courseServices.addStudentsToCourse(courseId,studentIds);
        return "added students sucessfully";
    }
    @GetMapping("/courses/")
    public List<Course> getAll(){
        return courseServices.getAll();
    }

    @DeleteMapping("course/id/{id}")
    public String deleteById(@PathVariable Integer id){
        return courseServices.deleteById(id);
    }
}
