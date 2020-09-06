package com.ahsieh02.generic.object;

public class Office extends Building {
    public Office(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
