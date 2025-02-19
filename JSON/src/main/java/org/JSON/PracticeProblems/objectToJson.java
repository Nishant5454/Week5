package org.JSON.PracticeProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    private String name;
    private String color;
    private int price;
    Car(String name,String color,int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getPrice(){
        return this.price;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(int price){
        this.price=price;
    }
}

public class objectToJson {
    public static void main(String[] args) throws Exception {
        try {


            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Maruti", "Black", 12000);
            String jsoncar = objectMapper.writeValueAsString(car);
            System.out.println(jsoncar);


        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
