package com.example.tdd.repository;

import com.example.tdd.domain.Book;
import com.example.tdd.util.BoolUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

  public List<Book> findAll() {
    return BoolUtil.getAllBooks();
  }

}
