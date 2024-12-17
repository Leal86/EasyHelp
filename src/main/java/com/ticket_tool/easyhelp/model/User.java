package com.ticket_tool.easyhelp.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity //Marca a classe como uma entidade JPA
@Table(name = "Users") //Nome da tabela no banco
public class User {

    @Id
    private int idUser;

    @Column(name = "name", nullable = false) //Nome da coluna no banco
    private String name;

    @Column(name = "lastName", nullable = false) //Nome da coluna no banco
    private String lastName;

    @Column(name = "password", nullable = false) //Nome da coluna no banco
    private String password;

    @Column(name = "function", nullable = false) //Nome da coluna no banco
    private String function;

    @Column(name = "dateOfBirth", nullable = false) //Nome da coluna no banco
    private Date dateOfBirth;

    @Column(name = "email", nullable = false) //Nome da coluna no banco
    private String email;

    //Getters and Setters

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser){
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passsword) {
        this.password = passsword;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}