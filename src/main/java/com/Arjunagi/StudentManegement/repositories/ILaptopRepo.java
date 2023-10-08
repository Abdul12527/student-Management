package com.Arjunagi.StudentManegement.repositories;

import com.Arjunagi.StudentManegement.Models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Integer> {
}
