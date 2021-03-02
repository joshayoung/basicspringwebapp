package com.joshayoung.basicspringwebapp.domain.bootstrap;

import com.joshayoung.basicspringwebapp.domain.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.joshayoung.basicspringwebapp.domain.Book;

@Component
public class BootStrapData implements CommandLineRunner {

    public final BookRepository bookRepository;

    public BootStrapData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book practicalCoding = new Book();
        practicalCoding.setTitle("test");
        practicalCoding.setIsbn("1234");
        bookRepository.save(practicalCoding);

        System.out.printf("Number of Books " + bookRepository.count());
    }
}
