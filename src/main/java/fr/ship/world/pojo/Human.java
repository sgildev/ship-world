package fr.ship.world.pojo;

public class Human {

    private String name;
    private String race;

    private String sex;

    public Human() {
    }

    public Human(String name, String sex, String race) {
        this.name = name;
        this.race = race;
        this.sex = sex;
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
}