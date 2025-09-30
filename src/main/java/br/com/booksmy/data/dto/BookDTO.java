package br.com.booksmy.data.dto;

import br.com.booksmy.enums.BookCategories;
import br.com.booksmy.model.Book;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Objects;

public class BookDTO extends RepresentationModel<BookDTO> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String author;
    private String description;
    private Double price;
    private String urlImage;
    private String isbn;
    private String publisher;
    private Integer publicationYear;
    private Integer pageNumber;
    private BookCategories categories;

    public BookDTO() {}

    public BookDTO(Long id, String title, String author, String description, Double price, String urlImage, String isbn, String publisher, Integer publicationYear, Integer pageNumber, BookCategories categories) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.urlImage = urlImage;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.pageNumber = pageNumber;
        this.categories = categories;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public BookCategories getCategories() {
        return categories;
    }

    public void setCategories(BookCategories categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookDTO bookDTO = (BookDTO) o;
        return serialVersionUID == bookDTO.serialVersionUID && Objects.equals(id, bookDTO.id) && Objects.equals(title, bookDTO.title) && Objects.equals(author, bookDTO.author) && Objects.equals(description, bookDTO.description) && Objects.equals(price, bookDTO.price) && Objects.equals(urlImage, bookDTO.urlImage) && Objects.equals(isbn, bookDTO.isbn) && Objects.equals(publisher, bookDTO.publisher) && Objects.equals(publicationYear, bookDTO.publicationYear) && Objects.equals(pageNumber, bookDTO.pageNumber) && categories == bookDTO.categories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUID, id, title, author, description, price, urlImage, isbn, publisher, publicationYear, pageNumber, categories);
    }

}
