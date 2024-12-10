package com.ticket_tool.easyhelp.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Ticket {
    @Id
    private int idTicket;
    
    @Column(name = "Start Date", nullable = false) // Nome da coluna no banco
    private Date startDate;
    
    @Column(name = "Time of Request", nullable = false) // Nome da coluna no banco
    private Date timeOfRequest;
    
    @Column(name = "Type of Request", nullable = false) // Nome da coluna no banco
    private String typeOfRequest;
    
    @Column(name = "Category", nullable = false) // Nome da coluna no banco
    private String category;
    
    @Column(name = "Priority", nullable = false) // Nome da coluna no banco
    private String priority;
    
    @Column(name = "Subject", nullable = false) // Nome da coluna no banco
    private String subject;
    
    @Column(name = "Status", nullable = false) // Nome da coluna no banco
    private String status;
    
    @Column(name = "Description", nullable = false) // Nome da coluna no banco
    private String description;


    //Getters and Setters

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getTimeOfRequest() {
        return timeOfRequest;
    }

    public void setTimeOfRequest(Date timeOfRequest) {
        this.timeOfRequest = timeOfRequest;
    }

    public String getTypeOfRequest() {
        return typeOfRequest;
    }

    public void setTypeOfRequest(Date timeOfRequest) {
        this.timeOfRequest = timeOfRequest;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory( String catergory) {
        this.category = catergory;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
