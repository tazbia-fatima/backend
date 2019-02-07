package models;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Profile {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("Id")
    private Integer Id;

    @Id
    @JsonProperty("name")
    private String name;

    @Basic
    @JsonProperty("dob")
    private Integer dob;

    @Basic
    @JsonProperty("height")
    private Integer height;

    @Basic
    @JsonProperty("weight")
    private Integer weight;

    @Basic
    @JsonProperty("orientation")
    private String orientation;


    public Profile() {
    }

    public Profile(String name, Integer dob, Integer height, Integer weight, String orientation) {
        this.name = name;
        this.dob = dob;
        this.height=height;
        this.weight = weight;
        this.orientation = orientation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return dob;
    }

    public void setAge(Integer dob) {
        this.dob = dob;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height){
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }


}