package com.ahsieh02.generic;

import com.ahsieh02.generic.object.Building;
import com.ahsieh02.generic.object.Office;

import java.util.ArrayList;
import java.util.List;

/*
If S is a subtype of T,
then objects of type T may be replaced with objects of type S
without altering any of the desirable properties of the program (correctness, task performed, etc.)
 */
public class SubstitutionPrinciple {

    public static void main(String[] args) {
        List<Building> buildingList = new ArrayList<>();
        addBuild(buildingList);
        addOffice(buildingList);
        printBuildings(buildingList);

        List<Office> offices = new ArrayList<>();
        addOffice(offices);
        addOffice(offices);
        printBuildings(offices);
    }

    /*
     ? extends parent
     allow to pass any subtype of parent class
     */
    private static void printBuildings(List<? extends Building> buildings) {
        System.out.println("-----start printBuildings-----");
        for (Building building : buildings) {
            System.out.println("building  " + building);
        }
        System.out.println("-----end printBuildings-----");

    }

    private static void addBuild(List<Building> buildings) {
        String name = "building" + buildings.size();
        buildings.add(new Building(name));
    }

    /*
    ? super subClass
    allow to pass any parent type of subClass
     */
    private static void addOffice(List<? super Office> officeList) {
        String name = "office" + officeList.size();
        officeList.add(new Office(name));
    }
}


