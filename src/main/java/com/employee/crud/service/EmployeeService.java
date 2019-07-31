package com.employee.crud.service;

import com.employee.crud.data.EmployeeData;
import com.employee.crud.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employeeData= EmployeeData.employeeData();

    public List<Employee> getAllEmployee(){
        return employeeData;
    }
    public void addEmployee(Employee employee){
        employeeData.add(employee);
    }
    public void updateEmployeeById(int id,Employee employee){
        Employee oldemployee=getEmployeeById(id);
        oldemployee.setAge(employee.getAge());
        oldemployee.setGender(employee.getGender());
        oldemployee.setId(employee.getId());
        oldemployee.setName(employee.getName());
        save(oldemployee);
    }

    private void save(Employee employee) {
        int index=0;
        for(int i=0;i<employeeData.size();i++){
            if(employeeData.get(i).getId()==employee.getId()){
                index=i;
            }
        }
        employeeData.set(index,employee);
    }

    public Employee  getEmployeeById(int id){
        Employee getEmployee=null;
        for(Employee employee:employeeData){
            if(employee.getId()==id){
                getEmployee=employee;
                break;
            }
        }
        return getEmployee;
    }

    public void deleEmployeeById(int id){
        Employee deleteEmployee=getEmployeeById(id);
        employeeData.remove(deleteEmployee);
    }
}
