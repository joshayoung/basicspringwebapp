package com.joshayoung.basicspringwebapp.domain.repositories;

import com.joshayoung.basicspringwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
