package org.JSON.PracticeProblems;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Person{
    private String name;
    private String email;
    private int age;
    Person(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }


}

public class ReadJson {
    public static void main(String[] args) throws FileNotFoundException, JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String data = ("data.json");

            JsonNode person = objectMapper.readTree(new File(data));
            System.out.println("The name of the User is " + person.path("name").asText());
            System.out.println("The email of the User is " + person.path("email").asText());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
 Read a JSON file and extract only specific fields (e.g., name, email).

 */
