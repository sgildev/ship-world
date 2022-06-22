package fr.ship.world.pojo;

import java.util.ArrayList;
import java.util.List;


public class Ship {
    private String name;
    private String description;
    private int NumberOfPassengers;
    private String color;

    private List<Human> humans = new ArrayList<>();





    public Ship() {

    }

    public Ship(String name, String description, int numberOfPassenger, String color) {
        this.name = name;
        this.description = description;
        this.NumberOfPassengers = numberOfPassenger;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberofPassanger() {
        return NumberOfPassengers;
    }

    public String getColor() {
        return color;
    }

    public List<Human> getFruits() {
        return humans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumberDePasanger(int numberOfPassenger) {
        this.NumberOfPassengers = numberOfPassenger;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }


    }

