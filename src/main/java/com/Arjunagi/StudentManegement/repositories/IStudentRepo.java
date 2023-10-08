package com.Arjunagi.StudentManegement.repositories;

import com.Arjunagi.StudentManegement.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Integer> {
}
