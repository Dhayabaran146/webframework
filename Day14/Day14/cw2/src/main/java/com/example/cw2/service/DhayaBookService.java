package com.example.cw2.service;

import com.example.cw2.model.DhayaBook;
import com.example.cw2.repository.DhayaBookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhayaBookService {
    private final DhayaBookRepo bookRepo;

    public DhayaBookService(DhayaBookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public DhayaBook createBook(DhayaBook Book) {
        return bookRepo.save(Book);
    }
    public List<DhayaBook> getAllBooks() {
        return bookRepo.findAll();
    }
    public DhayaBook getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    public DhayaBook updateBookById(Long id,DhayaBook book){
        DhayaBook b = bookRepo.findById(id).orElse(null);
        if(b!=null){
            b.setAuthor(book.getAuthor());
            b.setAvailableCopies(book.getAvailableCopies());
            b.setTitle(book.getTitle());
            b.setTotalCopies(book.getTotalCopies());
            bookRepo.save(b);
        }
        return b;
    }
}
