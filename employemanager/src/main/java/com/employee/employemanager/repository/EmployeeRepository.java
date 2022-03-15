package com.employee.employemanager.repository;

import java.util.Optional;

import com.employee.employemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
    
}
