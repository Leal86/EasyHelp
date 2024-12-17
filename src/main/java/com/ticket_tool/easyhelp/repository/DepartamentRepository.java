package com.ticket_tool.easyhelp.repository;

import com.ticket_tool.easyhelp.model.Departament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentRepository extends JpaRepository<Departament, Integer> {

    Departament findByNameDepartament(String nameDepartament);
}