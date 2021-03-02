package com.joshayoung.basicspringwebapp.domain.bootstrap;

import com.joshayoung.basicspringwebapp.domain.Author;
import com.joshayoung.basicspringwebapp.domain.repositories.AuthorRepository;
import com.joshayoung.basicspringwebapp.domain.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.joshayoung.basicspringwebapp.domain.Book;

@Component
public class BootStrapData implements CommandLineRunner {

    public final BookRepository bookRepository;
    public final AuthorRepository authorRepository;

    public BootStrapData(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book practicalCoding = new Book();
        practicalCoding.setTitle("test");
        practicalCoding.setIsbn("1234");
        bookRepository.save(practicalCoding);

        System.out.printf("Number of Books: " + bookRepository.count());

        Author joe = new Author();
        joe.setFirstName("Joe");
        joe.setLastName("Smith");
        authorRepository.save(joe);

        System.out.println("\n");
        System.out.printf("Number of Authors: " + authorRepository.count());
    }
}
