
package com.mycompany.employees;

public class EmployeePj {

    public static void main(String[] args) {
        
    Employee employee1 = new Employee();
    System.out.println("Default Constructor: " + employee1.getName());
    System.out.println("Default Constructor: " + employee1.getSalary()); 
   
    
    Employee employee2 = new Employee("John Doe", 200.50);
    System.out.println("Parameters Constructor: " + employee2.getName());
    System.out.println("Parameters Constructor: " + employee2.getSalary());

    employee2.setName("John Smith");
    employee2.setSalary(5000);
    System.out.println("After Setters: " + employee2.getName());
    System.out.println("After Setters: " + employee2.getSalary());
    
        
    
    }
}
