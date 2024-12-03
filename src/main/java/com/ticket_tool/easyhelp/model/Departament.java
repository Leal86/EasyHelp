package com.ticket_tool.easyhelp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class Departament {
	@Id
	private int idDepartament;
	
	@Column(name = "nameDepartment", nullable = false) // Nome da coluna no banco
	private String nameDepartment;
	
	@Column(name = "acronym", nullable = false) // Nome da coluna no banco
	private String acronym;
	
	@Column(name = "phoneNumber", nullable = false) // Nome da coluna no banco
	private String phoneNumber;

	public int getIdDepartament(){
		return idDepartament;
	}

	public void setIdDepartament(int idDepartament){
		this.idDepartament = idDepartament;
	}

	public String getNameDepartment(){
		return nameDepartment;
	}

	public void setNameDepartament(String nameDepartment){
		this.nameDepartment = nameDepartment;
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

	public void setPhoneNumber( String phoneNumeber){
		this.phoneNumber = phoneNumeber;
	}

}