package guru.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String adress;
  private String city;
  private String state;
  private String zip;
  @OneToMany
  @JoinColumn(name = "publisher_id")
  private Set<Book> books = new HashSet<>();

  public Publisher() {
  }

  public Publisher(String adress, String city, String state, String zip) {
    this.adress = adress;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  public Set<Book> getBooks() {
    return books;
  }

  public void setBooks(Set<Book> books) {
    this.books = books;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }
}
