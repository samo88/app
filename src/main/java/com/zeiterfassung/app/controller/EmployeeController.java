package com.zeiterfassung.app.controller;

import com.zeiterfassung.app.model.Employee;
import com.zeiterfassung.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @GetMapping(path = "/employees")
    public List <Employee> getAllEmployees(){
        return service.getAllEmployee();
    }
    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public String addEmployee(@RequestParam(name = "Vorname") String vorName,
                                @RequestParam(name = "Nachname") String nachName,
                                @RequestParam(name = "Passwort") String password){
        Employee employee = new Employee(vorName,nachName,password);
        service.addEmployee(employee);
        return "redirect:/index";
    }
    @RequestMapping(path = "/findEmployee", method = RequestMethod.POST)
    public Employee findEmployee(@RequestParam(name = "Employee") String employee){
        return service.findEmployee(employee);
    }
    @RequestMapping(path = "/addEmployee", method = RequestMethod.POST)
    public Employee findEmployee(@RequestParam(name = "Vorname") String vorname,
                                 @RequestParam(name = "Nachname") String nachName,
                                 @RequestParam(name = "Password") String password){
        return service.addEmployee(vorname,nachName,password);
    }

}
