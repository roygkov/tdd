package com.example.tdd.util;

import com.example.tdd.domain.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.List;

@UtilityClass
public class BoolUtil {

  public List<Book> getAllBooks() {
    return Arrays.asList(
        Book.builder().name("The Handmaid's Tale").author("Margaret Atwood").build(),
        Book.builder().name("The Silver Pigs").author("Lindsey Davis").build(),
        Book.builder().name("The Signature of All Things").author("Elizabeth Gilbert").build()
    );
  }

  @SneakyThrows
  public String getBooksAsJson(final List<Book> books) {
    return new ObjectMapper().writeValueAsString(books);
  }

}
