package com.joshayoung.basicspringwebapp.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import com.joshayoung.basicspringwebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
