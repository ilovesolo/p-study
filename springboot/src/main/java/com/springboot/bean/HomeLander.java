package com.springboot.bean;

public class HomeLander {
    private String name;
    private String ability;

    public HomeLander(String name, String ability) {
        this.name = name;
        this.ability = ability;
    }

    public HomeLander() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "HomeLander{" +
                "name='" + name + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }
}
