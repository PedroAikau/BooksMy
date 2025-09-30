package br.com.booksmy.services;


import br.com.booksmy.controllers.BookController;
import br.com.booksmy.data.dto.BookDTO;
import static br.com.booksmy.mapper.ObjectMapper.parseListObjects;
import static br.com.booksmy.mapper.ObjectMapper.parseObject;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import br.com.booksmy.exception.RequiredObjectIsNullException;
import br.com.booksmy.exception.ResourceNotFoundException;
import br.com.booksmy.model.Book;
import br.com.booksmy.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServices {

    private Logger logger = LoggerFactory.getLogger(BookServices.class.getName());

    @Autowired
    BookRepository repository;

    public List<BookDTO> findAll(){
        logger.info("Finding all Books!");

        List<BookDTO> books = parseListObjects(repository.findAll(), BookDTO.class);

        for(int i = 0; i < books.size(); i++){
            addHateoasLinks(books.get(i));
        }

        return books;
    }

    public BookDTO findById(Long id){
        logger.info("Finding one Book");
        var entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No records for this id!"));
        BookDTO book = parseObject(entity, BookDTO.class);
        addHateoasLinks(book);
        return book;
    }

    public BookDTO create(BookDTO book){
        if(book == null) throw new RequiredObjectIsNullException();
        logger.info("Creating one Book");
        var entity = parseObject(book, Book.class);
        var dto = parseObject(repository.save(entity), BookDTO.class);
        addHateoasLinks(dto);
        return dto;
    }

    public BookDTO update(BookDTO book){
        if(book == null) throw new RequiredObjectIsNullException();

        logger.info("Updating one Book");

        var entity = repository.findById(book.getId()).orElseThrow(() -> new ResourceNotFoundException("No Records found for this ID!"));
        entity.setTitle(book.getTitle());
        entity.setAuthor(book.getAuthor());
        entity.setDescription(book.getDescription());
        entity.setPrice(book.getPrice());
        entity.setUrlImage(book.getUrlImage());
        entity.setIsbn(book.getIsbn());
        entity.setPublisher(book.getPublisher());
        entity.setPublicationYear(book.getPublicationYear());
        entity.setPageNumber(book.getPageNumber());
        entity.setCategories(book.getCategories());

        var dto = parseObject(repository.save(entity), BookDTO.class);
        // addHateoasLinks(dto);
        return dto;
    }

    public void delete(Long id){
        if(id == null) throw new RequiredObjectIsNullException();

        logger.info("Deleting one Book");
        var entity = repository.findById(id).orElseThrow(()-> new ResourceNotFoundException("No Records found for this ID!"));
        repository.delete(entity);
    }


    private void addHateoasLinks(BookDTO dto){
        dto.add(linkTo(methodOn(BookController.class).findById(dto.getId())).withSelfRel().withType("GET"));

        dto.add(linkTo(methodOn(BookController.class).delete(dto.getId())).withRel("delete").withType("DELETE"));

        dto.add(linkTo(methodOn(BookController.class).findAll()).withRel("findAll").withType("GET"));

        dto.add(linkTo(methodOn(BookController.class).create(dto)).withRel("create").withType("POST"));

        dto.add(linkTo(methodOn(BookController.class).update(dto)).withRel("update").withType("PUT"));

    }


    // findAll
    // findById
    // create
    // update
    // delete
    // addHateoasLinks
}
