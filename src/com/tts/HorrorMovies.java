package com.tts;

//Create a custom class
public class HorrorMovies {
    //Minimum 3 private instance variables
    private String subgenre;
    private String name;
    private String year;

    //An empty constructor
    public HorrorMovies() {
    }

    //A constructor that uses only 2 of your 3 variables
    public HorrorMovies(String subgenre, String name) {
        this.subgenre = subgenre;
        this.name = name;
    }

    //A constructor that uses all 3 of your variables
    public HorrorMovies(String subgenre, String name, String year) {
        this.subgenre = subgenre;
        this.name = name;
        this.year = year;
    }

    //Get methods
    public String getSubgenre() {
        return subgenre;
    }
    public String getName() {
        return name;
    }
    public String getYear() {
        return year;
    }

    //Set methods
    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(String year) {
        this.year = year;
    }

    //A method that returns a boolean
    public boolean isGory() {
        return isGory();
    }

    //A method that returns a string
    public String toString() {
        return toString();
    }
}
