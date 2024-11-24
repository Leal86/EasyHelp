package com.ticket_tool.easyhelp.model;

import javax.persistence.*;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Marca a classe como uma entidade JPA
@Table(name = "usuarios") //Nome da tabela no banco
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Chave primária autoincrementada
    private Long id;

    @Column(name = "nome", nullable = false) //Nome da coluna no banco
    private String nome;
}