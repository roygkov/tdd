package com.example.tdd.service;

import com.example.tdd.domain.Book;
import com.example.tdd.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

  private final BookRepository repository;

  public BookService(final BookRepository repository) {
    this.repository = repository;
  }

  public List<Book> retrieveAll() {
    return repository.findAll();
  }

  public Optional<Book> retrieveByName(final String name) {
    return repository.findAll().stream()
        .filter(book -> book.getName().equals(name))
        .findAny();
  }

}
