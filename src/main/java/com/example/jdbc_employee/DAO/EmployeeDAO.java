package com.example.jdbc_employee.DAO;

import com.example.jdbc_employee.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAllEmployees();

    Employee findEmployeeById(int id);

    void updateEmployee(Employee employee, int id);

    void deleteEmployee(int id);

    void addEmployee(Employee employee);
}
