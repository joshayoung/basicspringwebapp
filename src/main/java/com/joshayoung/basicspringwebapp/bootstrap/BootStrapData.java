package com.joshayoung.basicspringwebapp.bootstrap;

import com.joshayoung.basicspringwebapp.domain.Author;
import com.joshayoung.basicspringwebapp.domain.Publisher;
import com.joshayoung.basicspringwebapp.repositories.AuthorRepository;
import com.joshayoung.basicspringwebapp.repositories.BookRepository;
import com.joshayoung.basicspringwebapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.joshayoung.basicspringwebapp.domain.Book;

@Component
public class BootStrapData implements CommandLineRunner {

    public final BookRepository bookRepository;
    public final AuthorRepository authorRepository;
    public final PublisherRepository publisherRepository;

    public BootStrapData(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
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

        practicalCoding.getAuthors().add(joe);
        bookRepository.save(practicalCoding);

        joe.getBooks().add(practicalCoding);
        authorRepository.save(joe);

        System.out.println("\n");
        System.out.println("Author's Books: " + joe.getBooks().size());
        System.out.println("\n");
        System.out.println("Book's Authors: " + practicalCoding.getAuthors().size());

        Publisher publisher = new Publisher("123 Main", "City", "AB", "11111");
        practicalCoding.setPublisher(publisher);
        publisher.getBooks().add(practicalCoding);
        publisherRepository.save(publisher);
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
