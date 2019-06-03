package com.example.restful.controller;


import com.example.restful.entities.Employee;
import com.example.restful.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/rest")
public class EmployeeRestController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/employees", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Employee> getAllEmployees(){
        List<Employee> list = employeeService.getAllEmployee();
        return list;
    }
    @RequestMapping(value="/employees/{empId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Employee getEmployees(@PathVariable("empId") Long empId){
        return employeeService.getEmployee(empId);
    }

    @RequestMapping(value="/employees", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @RequestMapping(value="/employees", method = RequestMethod.PUT, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @RequestMapping(value="/employees/{empId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String deleteEmployee(@PathVariable("empId") Long tempId){
        employeeService.deleteEmployee(tempId);
        return "Delete Sucessful";
    }

}
