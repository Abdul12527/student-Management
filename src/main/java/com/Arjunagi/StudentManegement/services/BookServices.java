package com.Arjunagi.StudentManegement.services;

import com.Arjunagi.StudentManegement.Models.Book;
import com.Arjunagi.StudentManegement.Models.Student;
import com.Arjunagi.StudentManegement.repositories.IBookRepo;
import com.Arjunagi.StudentManegement.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {
    @Autowired
    IBookRepo bookRepo;
    @Autowired
    IStudentRepo studentRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public void updateStudent(Integer bookId, Integer studentId) {
        Book book=bookRepo.findById(bookId).orElseThrow();
        Student student= studentRepo.findById(studentId).orElseThrow();
        book.setStudent(student);
        bookRepo.save(book);
    }

    public void updateBookPrice(Integer bookId, String newPrice) {
        Book book=bookRepo.findById(bookId).orElseThrow();
        book.setPrice(newPrice);
        bookRepo.save(book);
    }

    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    public void deleteBookById(Integer id) {
        bookRepo.deleteById(id);
    }
}
