package com.example.restful.service;

import com.example.restful.dao.EmployeeDAO;
import com.example.restful.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    public List<Employee> getAllEmployee(){
        return employeeDAO.getAllEmployee();
    }
    public Employee getEmployee(Long empId){
        return employeeDAO.getEmployee(empId);
    }
    public Employee addEmployee(Employee employee){
        return employeeDAO.addEmployee(employee);
    }
    public Employee updateEmployee(Employee employee){
        return employeeDAO.updateEmployee(employee);
    }
    public void deleteEmployee(Long empId){
        employeeDAO.deleteEmployee(empId);
    }
}
