package com.Arjunagi.StudentManegement.repositories;

import com.Arjunagi.StudentManegement.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
