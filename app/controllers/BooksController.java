package controllers;

import dao.BookDao;
import com.fasterxml.jackson.databind.JsonNode;
import play.db.jpa.Transactional;
import models.Book;
import play.Logger;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;


import javax.inject.Inject;
import java.util.Collection;
import java.util.Optional;

public class BooksController extends Controller {

    //int index = 0;
    //final Map<Integer, Book> books = new HashMap<>();

    private final static Logger.ALogger LOGGER = Logger.of(BooksController.class);

    final BookDao bookDao;

    @Inject
    public BooksController(BookDao bookDao) {
        this.bookDao = bookDao;
    }
    //final JPAApi jpaApi;


    /*@Inject
    public BooksController(BookDaoImpl bookDaoImpl) {
        this.bookDaoImpl = bookDaoImpl;
        //this.jpaApi = jpaApi;
    }*/

    @Transactional
    public Result createbook(){

        final JsonNode json = request().body().asJson();
        final Book book = Json.fromJson(json, Book.class);

        LOGGER.debug("Book title = "  +book.getTitle());
        LOGGER.error("This is an error");

        if(null == book.getTitle()) {
            return badRequest("Title must be provided");
        }

        //book.setID(index++);
        //books.put(book.getID(), book);
        final Book newBook = bookDao.create(book);

        //jpaApi.em().persist(book);

        final JsonNode result = Json.toJson(newBook);

        return ok(result);
    }
    @Transactional
    public Result getbookbyid(Integer Id){

        if( null == Id) {
            return badRequest("Enter id");
        }

        //final Book book = jpaApi.em().find(Book.class,Id);
        final Optional<Book> book = bookDao.read(Id);
        if(book.isPresent()) {
            final JsonNode result = Json.toJson(book.get());
            return ok(result);
        } else {
            return notFound();
        }
        //if(null == book) {
            //return notFound();
        //}

        /*final JsonNode result = Json.toJson(book);
        return ok(result);*/
    }
    @Transactional
    public Result updatebookbyid(Integer Id){

       if(null == Id){
           return badRequest("Id must be provided");
       }
        /*final Book existingbook = jpaApi.em().find(Book.class,Id);
       if(null == existingbook) {
           return notFound();
       }*/

       final JsonNode json = request().body().asJson();
       final Book newBook = Json.fromJson(json,Book.class);

       newBook.setID(Id);

       final Book updatedBook = bookDao.update(newBook);
       /*existingbook.setTitle(newBook.getTitle());
       jpaApi.em().persist(existingbook);*/
       //books.put(existingbook.getID(),existingbook);

       final JsonNode result = Json.toJson(updatedBook);

        return ok(result);
    }
    @Transactional
    public Result deletebookbyid(Integer Id){

        if(null == Id)
        {
            return badRequest("Id must be provided");
        }

        /*final Book existingbook =jpaApi.em().find(Book.class,Id);
        if(null == existingbook) {
            return notFound();
        }*/

        final Book existingBook = bookDao.delete(Id);

        //books.remove(Id,existingbook);
        //jpaApi.em().remove(existingbook);

        final JsonNode result = Json.toJson(existingBook);


        return ok(result);
    }
    @Transactional
    public Result getallbooks(){

        /*TypedQuery<Book> query = jpaApi.em().createQuery("SELECT b from Book b",Book.class);
        List<Book> books = query.getResultList();*/
        Collection<Book> books = bookDao.all();
        final JsonNode result = Json.toJson(books);

        return ok(result);
    }
}
