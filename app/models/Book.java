package models;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("id")
    private Integer Id;

    @Basic
    @JsonProperty("title")
    private String title;


    public Book(Integer Id, String title){
        this.Id=Id;
        this.title=title;
    }

    public Book(){

    }

    public Integer getID() {
        return Id;
    }

    public void setID(Integer Id) {
        this.Id = Id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
