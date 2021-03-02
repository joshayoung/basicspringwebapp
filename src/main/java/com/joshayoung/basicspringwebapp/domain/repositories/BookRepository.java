package com.joshayoung.basicspringwebapp.domain.repositories;

import com.joshayoung.basicspringwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
