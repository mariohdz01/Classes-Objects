package com.tts;

//Create a "Pet" Class
public class Pet {
//Create instance variables
// These variables are in a class (pet) and not inside any function

    private String name;
    private String location;
    private String type;
    private int age;

    //Empty constructor
    public Pet() {
    }

    //Constructor with all attributes
    public Pet(String name, String location, String type, int age) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.age = age;
    }

    //Get Methods
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }

    //Set Methods
    public void setName(String name) {
        this.name = name;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static void main(String[] args) {

    }
}
