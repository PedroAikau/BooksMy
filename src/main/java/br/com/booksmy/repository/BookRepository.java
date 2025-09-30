package br.com.booksmy.repository;

import br.com.booksmy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {}
