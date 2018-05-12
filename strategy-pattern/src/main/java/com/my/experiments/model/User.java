package com.my.experiments.model;

import com.my.experiments.power.Superpower;

public class User {

    private String name;
    private String motto;
    private int age;
    private Superpower superpower;

    public User(String name, String motto, int age, Superpower superpower) {
        this.name = name;
        this.motto = motto;
        this.age = age;
        this.superpower = superpower;
    }

    public String getName() {
        return name;
    }

    public String getMotto() {
        return motto;
    }

    public int getAge() {
        return age;
    }

    public String executePower() {
        return superpower.execute();
    }

    public String getSuperpowerName() {
        return superpower.description();
    }

    public String introduction() {
        return String.format("My name is %s and my super power is %s", name, superpower.description());
    }

    public void setSuperPower(Superpower superPower) {
        this.superpower = superPower;
    }
}
