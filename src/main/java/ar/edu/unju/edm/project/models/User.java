package ar.edu.unju.edm.project.models;

import org.springframework.stereotype.Component;

@Component
public class User {
    
    private Integer id;
    private Integer idCard;
    private String name;
    private String surname;

    public User() {
    }

    public User(Integer id, Integer idCard, String name, String surname) {
        this.id = id;
        this.idCard = idCard;
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
