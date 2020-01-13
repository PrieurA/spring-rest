package com.example.rest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByTitleContainingOrDescriptionContaining(String keyword, String anotherkeyword);

}
