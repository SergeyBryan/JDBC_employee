package com.example.jdbc_employee;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {

   private int id;
   private String firstName;
   private String lastName;
   private String gender;
   private int age;
   private int cityId;

}
