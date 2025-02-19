package org.JSON.PracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String name;
    private int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

}

public class javatoJson {
    public static void main(String[] args) throws JsonProcessingException {
        try{
        List<Student>ls=new ArrayList<>();
        ls.add(new Student("Nishant",23));
        ls.add(new Student("Pankaj",46));
        ObjectMapper objectMapper=new ObjectMapper();
        String json=objectMapper.writeValueAsString(ls);
        System.out.println(json);
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Operation Executed Sucsessfully");
        }
        }
}
/*
Java object to Json array
 */