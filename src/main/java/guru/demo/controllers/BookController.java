package guru.demo.controllers;

import guru.demo.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class BookController {

  private final BookRepository bookRepository;

  public BookController(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @RequestMapping("books")
  public String getBooks(Model model){
    model.addAttribute("books", bookRepository.findAll());
    return "books/list";
  }
}
