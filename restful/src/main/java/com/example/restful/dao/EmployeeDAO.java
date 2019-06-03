package com.example.restful.dao;

import com.example.restful.entities.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class EmployeeDAO {
    private static final Map<Long, Employee> empMap = new HashMap<Long, Employee>();

    static{
        initEmps();
    }
    private  static void initEmps(){
        Employee emp1 = new Employee(1L, "E01", "Test1");
        Employee emp2 = new Employee(2L, "E02", "Test2");
        Employee emp3 = new Employee(3L, "E03", "Test3");

        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
    }

    public Employee getEmployee(Long empId){
        return empMap.get(empId);
    }

    public List<Employee> getAllEmployee(){
        Collection<Employee>  c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
    public Long getMaxEmpId(){
        Set<Long> keys = empMap.keySet();
        Long max = 0L;
        for (Long key : keys){
            if (key > max){
                max = key;
            }
        }
        return max;
    }
    public Employee addEmployee(Employee employee){
        Long empId = this.getMaxEmpId() + 1;
        employee.setEmId(empId);

        empMap.put(employee.getEmpId(), employee);
        return employee;
    }

    public Employee updateEmployee(Employee employee){
        Employee employee1 = this.getEmployee(employee.getEmpId());
        if(employee1 != null){
            employee1.setEmpNo(employee.getEmpNo());
            employee1.setEmpName(employee.getEmpName());
        }
        return employee1;
    }
    public void deleteEmployee(Long empId){
        empMap.remove(empId);
    }

}
