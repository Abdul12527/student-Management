package com.Arjunagi.StudentManegement.controllers;

import com.Arjunagi.StudentManegement.Models.Book;
import com.Arjunagi.StudentManegement.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookServices bookServices;

    @PostMapping("/book")
    public String addBook(@RequestBody Book book){
        bookServices.addBook(book);
        return "added sucessfully";
    }

    @PutMapping("/book/id/{bookId}/student")
    public String updateStudent(@PathVariable Integer bookId,@RequestParam Integer studentId){
        bookServices.updateStudent(bookId,studentId);
        return "student updation done";
    }
    @PutMapping("/book/id/{bookId}/price/{newPrice}")
    public String updateBookPrice(Integer bookId,String newPrice){
        bookServices.updateBookPrice(bookId,newPrice);
        return "price Updated sucessfully";
    }
    @GetMapping("/books")
    public List<Book> getAll(){
        return bookServices.getAll();
    }
    @DeleteMapping("/book/id/{id}")
    public String deleteBookById(@PathVariable Integer id){
        bookServices.deleteBookById(id);
        return "deleted sucessfully";
    }

}
