package com.zeiterfassung.app.service;

import com.zeiterfassung.app.model.Employee;
import com.zeiterfassung.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
    public void addEmployee(Employee e){
        employeeRepository.save(e);
        employeeRepository.flush();
    }
    public Employee findEmployee(String employeeName){
        Employee e= employeeRepository.findEmployeeByVorName(employeeName);
        return e;
    }
    public Employee addEmployee(String vorname, String nachname, String password){
        Employee e = new Employee(vorname, nachname,password);
        employeeRepository.save(e);
        employeeRepository.flush();
        return e;
    }
}
