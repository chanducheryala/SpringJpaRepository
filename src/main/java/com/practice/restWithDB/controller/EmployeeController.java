package com.practice.restWithDB.controller;

import com.practice.restWithDB.entity.Employee;
import com.practice.restWithDB.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;


    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        List<Employee> employees = employeeService.findAll();
        return employees;
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getById(@PathVariable int employeeId) {
        Employee employee = employeeService.findById(employeeId);
        return  employee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteById(@PathVariable int employeeId) {
        employeeService.deleteById(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployeeById(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
}
