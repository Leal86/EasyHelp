package com.ticket_tool.easyhelp.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Ticket {
    @Id
    private int idTicket;
    
    @Column(name = "Start Date", nullable = false)
    private Date startDate;
    
    @Column(name = "Time of Request", nullable = false)
    private Date timeOfRequest;
    
    @Column(name = "Type of Request", nullable = false)
    private String typeOfRequest;
    
    
    private String category;
    
    
    private String priority;
    
    
    private String subject;
    
    
    private String status;
    
    
    private String description;


    //Getters and Setters

    public int getIdTicket (){
        return idTicket;
    }

    public void setIdTicket (int idTicket){
        this.idTicket = idTicket;
    }
    
    public Date getStartDate (){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getTimeOfRequest(){
        return timeOfRequest;
    }

    public void setTimeOfRequest(Date timeOfRequest){
        this.timeOfRequest = timeOfRequest;
    }

    public String getTypeOfRequest(){
        return typeOfRequest;
    }

    public void setTypeOfRequest(Date timeOfRequest){
        this.timeOfRequest = timeOfRequest;
    }


}
