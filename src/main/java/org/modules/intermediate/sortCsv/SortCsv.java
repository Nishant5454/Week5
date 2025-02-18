package org.modules.intermediate.sortCsv;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;

public class SortCsv {
    public static void main(String[] args)throws Exception {
        int count=0;
        ArrayList<Employee>employees=new ArrayList<>();
        try {
            CSVReader csvReader=new CSVReader(new FileReader("csvfile.csv"));
            String[]nextRecord;
            while ((nextRecord=csvReader.readNext())!=null){
                if(count>0){
                    employees.add(new Employee(nextRecord[0],nextRecord[1],nextRecord[2],Double.parseDouble(nextRecord[3])));

                }
                count++;

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        employees.sort((Employee e1,Employee e2)->Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("The Sorted Salary of the Employee is ");
        System.out.println("ID|Name|Department|Salary");
        int counter=0;
        for(Employee emp:employees){
            if(counter>4){
                break;
            }
            System.out.println(emp.getId()+" "+emp.getName()+" "+ emp.getSalary()+" "+emp.getDepartment());

        }
    }
}
