package com.employee.empl.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.empl.Entity.Employee;
import com.employee.empl.Repo.EmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public Optional<Employee> findEmpById(int id){
        Optional<Employee> employee = null;
        try{
            employee = this.employeeRepo.findById(id);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
        return employee;
    }


    public List<Employee> getAllEmployee(){
        List<Employee> emplo = this.employeeRepo.findAll();
        return emplo;
    }

    public Employee addEmployee(Employee employee){
       return this.employeeRepo.save(employee);
    }

    public void deleteemployee(int eid){
        employeeRepo.deleteById(eid);
    }

    public void updateEmployee(Employee emplo, int id){
        emplo.setId(id);
        employeeRepo.save(emplo);
    }
    
}
