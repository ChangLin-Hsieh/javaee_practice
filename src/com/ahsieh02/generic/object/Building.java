package com.ahsieh02.generic.object;

public class Building {
    String name;

    public Building(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}