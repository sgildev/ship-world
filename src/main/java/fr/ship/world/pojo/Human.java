package fr.ship.world.pojo;

import java.util.ArrayList;
import java.util.List;

public class Human {

    private String name;
    private String race;

    private int years;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    private String sex;

    private List<Human> humans = new ArrayList<>();

    public Human() {
    }

    public Human(String name, String sex, String race , int years) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.years = years;
    }


    public String getName() {
        return name;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}