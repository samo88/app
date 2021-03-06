package com.zeiterfassung.app.repository;

import com.zeiterfassung.app.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

   Employee findEmployeeByVorName(String vorName);

}
