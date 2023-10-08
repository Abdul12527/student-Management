package com.Arjunagi.StudentManegement.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(name = "CourseStudentMmTable",joinColumns = @JoinColumn(name = "fkCourseId"),inverseJoinColumns = @JoinColumn(name = "fkStudentId"))
    private Set<Student> studentSet;
}
