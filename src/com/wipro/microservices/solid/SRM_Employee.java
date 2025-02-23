package com.wipro.microservices.solid;

//Outer class SRM_Employee
public class SRM_Employee {
 // Employee class - responsible for storing employee details
 class Employee {
     private String name;
     private String position;
     private double salary;

     public Employee(String name, String position, double salary) {
         this.name = name;
         this.position = position;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public String getPosition() {
         return position;
     }

     public double getSalary() {
         return salary;
     }
 }

 // SalaryCalculator class - responsible for calculating employee salary
 class SalaryCalculator {
     public double calculateSalary(Employee employee) {
         // Example salary calculation logic
         return employee.getSalary();
     }
 }

 // EmployeeDatabase class - responsible for saving employee data to the database
 class EmployeeDatabase {
     public void save(Employee employee) {
         // Logic to save employee data (just simulating with a print statement)
         System.out.println("Saving employee " + employee.getName() + " data to the database.");
     }
 }

 // EmailSender class - responsible for sending an email to the employee
 class EmailSender {
     public void send(Employee employee, String message) {
         // Logic to send an email (just simulating with a print statement)
         System.out.println("Sending email to " + employee.getName() + ": " + message);
     }
 }

 // Main method for execution
 public static void main(String[] args) {
     // Create an instance of SRM_Employee
     SRM_Employee outer = new SRM_Employee();

     // Create an employee object
     Employee employee = outer.new Employee("John Doe", "Software Engineer", 80000);

     // Use SalaryCalculator to calculate the employee's salary
     SalaryCalculator salaryCalculator = outer.new SalaryCalculator();
     double calculatedSalary = salaryCalculator.calculateSalary(employee);
     System.out.println("Employee Salary: " + calculatedSalary);

     // Save employee data to the database
     EmployeeDatabase employeeDatabase = outer.new EmployeeDatabase();
     employeeDatabase.save(employee);

     // Send an email to the employee
     EmailSender emailSender = outer.new EmailSender();
     emailSender.send(employee, "Welcome to the company!");
 }
}
