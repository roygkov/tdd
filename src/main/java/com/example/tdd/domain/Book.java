package com.example.tdd.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Book {

  private String name;
  private String author;

}
