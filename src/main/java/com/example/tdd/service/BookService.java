package com.example.tdd.service;

import com.example.tdd.domain.Book;
import com.example.tdd.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

  private final BookRepository repository;

  public BookService(final BookRepository repository) {
    this.repository = repository;
  }

  public List<Book> retrieveAll() {
    return repository.findAll();
  }

}
