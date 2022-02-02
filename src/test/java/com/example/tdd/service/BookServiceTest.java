package com.example.tdd.service;

import com.example.tdd.domain.Book;
import com.example.tdd.repository.BookRepository;
import com.example.tdd.util.BoolUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

  @Mock
  private BookRepository repository;

  @Test
  public void test_retrieveAll() {
    // given
    final BookService service = new BookService(repository);
    final List<Book> allBooks = BoolUtil.getAllBooks();

    when(service.retrieveAll()).thenReturn(allBooks);

    // when
    final List<Book> books = service.retrieveAll();

    // then
    assertThat(books)
        .isNotEmpty()
        .hasSize(3)
        .containsExactlyElementsOf(allBooks);
  }

}