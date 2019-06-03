package com.example.restful.entities;

public class Employee {
    private Long empId;
    private String empNo;
    private String empName;

    public Employee() {
    }


    public Employee(Long empId, String empNo, String empName) {
        this.empId = empId;
        this.empNo = empNo;
        this.empName = empName;
    }


    public Long getEmpId() {
        return empId;
    }

    public void setEmId(Long emId) {
        this.empId = emId;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
