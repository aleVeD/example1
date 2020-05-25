package guru.demo.bootstrap;


import guru.demo.domain.Author;
import guru.demo.domain.Book;
import guru.demo.repositories.AuthorRepository;
import guru.demo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BoostrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;

  public BoostrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Author a = new Author("Julio", "Verne");
    Book b = new Book("un capitan de 15 años", "868FGF");

      a.getBooks().add(b);



    b.getAuthors().add(a);
   authorRepository.save(a);
   bookRepository.save(b);
   authorRepository.count();
    System.out.println(bookRepository.count());
  }

}

