package org.modules.intermediate.sortCsv;

public class Employee {
    private String name;
    private String id;
    private String department;
    private double Salary;
    Employee(String name, String id, String department, double Salary){
        this.name=name;
        this.id=id;
        this.department=department;
        this.Salary=Salary;
    }
    public String getId(){
        return id;
    }
    public String getDepartment(){
        return department;
    }
    public String getName(){
        return name;

    }
    public double getSalary(){
        return Salary;
    }
}
