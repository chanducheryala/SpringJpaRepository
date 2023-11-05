package com.practice.restWithDB.service;

import com.practice.restWithDB.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
