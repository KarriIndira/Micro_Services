package com.wipro.microservices.solid;


public class SRM_Employee {
 
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

 
 class SalaryCalculator {
     public double calculateSalary(Employee employee) {
         
         return employee.getSalary();
     }
 }

 
 class EmployeeDatabase {
     public void save(Employee employee) {
         
         System.out.println("Saving employee " + employee.getName() + " data to the database.");
     }
 }

 
 class EmailSender {
     public void send(Employee employee, String message) {
         
         System.out.println("Sending email to " + employee.getName() + ": " + message);
     }
 }

 
 public static void main(String[] args) {
     
     SRM_Employee outer = new SRM_Employee();

     
     Employee employee = outer.new Employee("John Doe", "Software Engineer", 80000);

     
     SalaryCalculator salaryCalculator = outer.new SalaryCalculator();
     double calculatedSalary = salaryCalculator.calculateSalary(employee);
     System.out.println("Employee Salary: " + calculatedSalary);

     
     EmployeeDatabase employeeDatabase = outer.new EmployeeDatabase();
     employeeDatabase.save(employee);

     
     EmailSender emailSender = outer.new EmailSender();
     emailSender.send(employee, "Welcome to the company!");
 }
}
