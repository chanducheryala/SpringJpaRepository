package com.practice.restWithDB.dao;

import com.practice.restWithDB.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
