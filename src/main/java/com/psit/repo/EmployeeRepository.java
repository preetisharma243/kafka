package com.psit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

}
