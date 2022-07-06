package fr.ship.world.pojo;

public class Human {
    private String name;
    private String race;
    private int years;
    private String sex;

    public Human() {
    }

    public Human(String name, String sex, String race, int years) {
        this.name = name;
        this.race = race;
        this.sex = sex;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}