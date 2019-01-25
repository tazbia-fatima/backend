package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Basic;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class User {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;

    @Basic
    @JsonProperty("Name")
    private String name;

    @Basic
    @JsonProperty("Email")
    private String email;

    @Basic
    @JsonProperty("Password")
    private String password;

    public User(){

    }

    public User(Integer Id, String name, String email, String password) {
        this.Id=Id;
        this.name = name;
        this.email=email;
        this.password = password;
    }

    public Integer getId() {

        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }
}
