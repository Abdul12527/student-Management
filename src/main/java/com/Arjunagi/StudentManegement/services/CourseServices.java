package com.Arjunagi.StudentManegement.services;

import com.Arjunagi.StudentManegement.Models.Course;
import com.Arjunagi.StudentManegement.Models.Student;
import com.Arjunagi.StudentManegement.repositories.ICourseRepo;
import com.Arjunagi.StudentManegement.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CourseServices {
    @Autowired
    ICourseRepo courseRepo;
    @Autowired
    IStudentRepo studentRepo;
    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public void addStudentsToCourse(Integer courseId, List<Integer> studentIds) {
        Course course=courseRepo.findById(courseId).orElseThrow();
        Set<Student> students= new HashSet<>();
        for (Student i:studentRepo.findAllById(studentIds))students.add(i);
        if(course.getStudentSet()==null)course.setStudentSet( students);
        else course.getStudentSet().addAll(students);
        courseRepo.save(course);
    }

    public List<Course> getAll() {
        return courseRepo.findAll();
    }

    public String deleteById(Integer id) {
        try{
            courseRepo.deleteById(id);
            return "deleted sucessfully";
        }catch (Exception e){
            return e.toString();
        }
    }
}
