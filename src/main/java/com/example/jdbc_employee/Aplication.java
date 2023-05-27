package com.example.jdbc_employee;

import com.example.jdbc_employee.DAO.EmployeeDAO;
import com.example.jdbc_employee.DAO.EmployeeDAOImpl;

import java.sql.*;

public class Aplication {


    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        System.out.println(employeeDAO.findAllEmployees());
        Employee anna = new Employee();
        anna.setId(150);
        anna.setLastName("Kovaleva");
        anna.setFirstName("Anna");
        anna.setAge(25);
        anna.setCityId(1);
        anna.setGender("female");
        employeeDAO.addEmployee(anna);
        Employee kristina = new Employee();
        kristina.setAge(26);
        kristina.setFirstName("Kristina");
        kristina.setLastName("Bochkareva");
        kristina.setCityId(1);
        kristina.setGender("female");
        employeeDAO.updateEmployee(kristina, 150);
        System.out.println(employeeDAO.findEmployeeById(150));
        employeeDAO.deleteEmployee(150);
        System.out.println(employeeDAO.findEmployeeById(150));


    }
}
