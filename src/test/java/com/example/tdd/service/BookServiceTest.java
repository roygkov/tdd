package com.example.tdd.service;

import com.example.tdd.domain.Book;
import com.example.tdd.repository.BookRepository;
import com.example.tdd.util.BoolUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

  @Mock
  private BookRepository repository;

  @Test
  void test_RetrieveAll() {
    // given
    final BookService service = new BookService(repository);
    final List<Book> allBooks = BoolUtil.getAllBooks();

    when(repository.findAll()).thenReturn(allBooks);

    // when
    final List<Book> books = service.retrieveAll();

    // then
    assertThat(books)
        .isNotEmpty()
        .hasSize(allBooks.size())
        .containsExactlyElementsOf(allBooks);
  }

  @Test
  void test_RetrieveByName() {
    // given
    final BookService service = new BookService(repository);
    final String name = BoolUtil.getAllBooks().stream().findFirst().get().getName();

    when(repository.findAll()).thenReturn(BoolUtil.getAllBooks());

    // when
    final Optional<Book> book = service.retrieveByName(name);

    // then
    assertThat(book).isNotNull();
    assertThat(book.get().getName()).isEqualTo(name);
  }

}