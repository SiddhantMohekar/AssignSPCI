package com.employee.empl.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.empl.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}
