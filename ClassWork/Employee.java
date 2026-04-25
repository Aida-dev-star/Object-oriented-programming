
package com.mycompany.employees;

public class Employee {
    
    private String name;
    private double salary;
    
    public Employee(){
        name = "Unassigned";
        salary = 0.0;        
    }
        

    public Employee(String newName, double newSalary){
        name = newName;
        salary = newSalary;
    }

    public String getName(){
        return name;
    }
    
    public double setName(String newName){
        name = newName;
        return 0;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(double newSalary){
        salary = newSalary;
    }
    


}    
        
        
    

    

