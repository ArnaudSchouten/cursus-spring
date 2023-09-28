package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        // one publisher
        Publisher publisher = new Publisher("Floris", "Jan van Wallendalplein 19", "Edam", "Noord-Holland", "1135WL");

        Publisher aap = publisherRepository.save(publisher);

        System.out.println("save id: " + aap.getId());

        Author author1 = new Author("arnaud", "schouten");
        Book book1 = new Book("Aap", "fdada43434cjh");

        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(publisher);
        publisher.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);
        publisherRepository.save(publisher);

        Author author2 = new Author("roos", "regter");
        Book book2 = new Book("Noot", "tsaggafgas5656");

        book2.setPublisher(publisher);
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        publisher.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        bookRepository
                .findAll()
                .forEach(b -> System.out.println(b.getTitle()));

        System.out.println("number of publishers: " + publisherRepository.count());
        publisherRepository
                .findAll()
                .forEach(p -> System.out.println(p.toString()));

        System.out.println(publisher.getBooks().size());


    }
}
