package com.anushka.petAdoption.Entity;

import jakarta.persistence.*;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    private String name;
    private Integer age;
    private String breed;
    @Column(name = "isAdopted")
    private Integer isadopted;

    public Pet( String name, int age, String breed, Integer isadopted) {

        this.name = name;
        this.age = age;
        this.breed = breed;
        this.isadopted = isadopted;
    }
    public Pet(int id) {
        this.Id = id;
    }

    public Pet() {
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public Integer isIsadopted() {
        return isadopted;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setIsadopted(Integer isadopted) {
        this.isadopted = isadopted;
    }
}
