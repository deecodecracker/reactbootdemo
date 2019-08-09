package com.example.rs.reactbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rs.reactbootdemo.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
