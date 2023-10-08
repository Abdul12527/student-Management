package com.Arjunagi.StudentManegement.repositories;

import com.Arjunagi.StudentManegement.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
