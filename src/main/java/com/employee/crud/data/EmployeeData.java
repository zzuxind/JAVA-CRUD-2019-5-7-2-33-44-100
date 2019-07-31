package com.employee.crud.data;

import com.employee.crud.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
    public static List<Employee> employeeData() {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee0 = new Employee(0, "小明", 20, "男");
        Employee employee1 = new Employee(1, "小红", 19, "女");
        Employee employee2 = new Employee(2, "小智", 15, "男");
        Employee employee3 = new Employee(3, "小钢", 16, "女");
        employeeList.add(employee0);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        return employeeList;
    }
}

