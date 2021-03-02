package com.joshayoung.basicspringwebapp.repositories;

import com.joshayoung.basicspringwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
