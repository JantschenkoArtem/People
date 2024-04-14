package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

public class CountPeopleWithPowerfulSportsCars {
    public static int PeopleWithPowerfulSportsCars(Person[]people){
        int count=0;
        for (Person person:people){
            Car car=person.getCar();
            if (car.isSport()&&car.getPower()>500){
                count++;
            }
        }
        return count;
    }
}
