package com.example.springbootbackend.repository;

import com.example.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*  We no need to add @Repository Annotation for EmployeeRepository
    because it extends JpaRepository
    and Spring Data JPA internally provides @Repository Annotation
  */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
