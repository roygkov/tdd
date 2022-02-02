package com.example.tdd.controller;

import com.example.tdd.domain.Book;
import com.example.tdd.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  private final BookService bookService;

  public BookController(final BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping
  public List<Book> retrieveAll() {
    return bookService.retrieveAll();
  }

}
