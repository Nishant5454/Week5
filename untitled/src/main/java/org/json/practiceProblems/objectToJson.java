package org.json.practiceProblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    private String brandName;
   private String color;
    private int price;
    Car(String brandName,String color,int price){
        this.brandName=brandName;
        this.color=color;
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public String getBrandName(){
        return brandName;
    }
    public String getColor(){
        return color;
    }
    public void setPrice(int price){
        this.price=price;
        System.out.println(price);

    }
    public void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public void setColor(String color){
        this.color=color;
    }
}
public class objectToJson {
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Car car = new Car("Maruti", "Black", 12000);
            // Car car1=new Car("Kia","Brown",20000);
            String carJson = objectMapper.writeValueAsString(car);
            System.out.println("The Json format of the String is " + carJson);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
/*
Convert a Java object (Car) into JSON format.

 */
