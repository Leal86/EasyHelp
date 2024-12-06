package com.ticket_tool.easyhelp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Departament {
	@Id
	private int idDepartament;
	
	@Column(name = "nameDepartament", nullable = false) // Nome da coluna no banco
	private String nameDepartament;
	
	@Column(name = "acronym", nullable = false) // Nome da coluna no banco
	private String acronym;
	
	@Column(name = "phoneNumber", nullable = false) // Nome da coluna no banco
	private String phoneNumber;


	//Getters and Setters
	
	public int getIdDepartament(){
		return idDepartament;
	}

	public void setIdDepartament(int idDepartament){
		this.idDepartament = idDepartament;
	}

	public String getNameDepartament(){
		return nameDepartament;
	}

	public void setNameDepartament(String nameDepartament){
		this.nameDepartament = nameDepartament;
	}

	public String getAcronym(){
		return acronym;
	}

	public void setAcronym (String acronym){
		this.acronym = acronym;
	}

	public String getPhoneNumber(){
		return phoneNumber;
	}

	public void setPhoneNumber( String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

}