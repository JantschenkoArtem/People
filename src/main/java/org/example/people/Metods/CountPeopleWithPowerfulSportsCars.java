package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.People;
import org.example.people.Class.Person;

import java.util.List;

public class CountPeopleWithPowerfulSportsCars {
    public static int PeopleWithPowerfulSportsCars(List<Person>people){
        int count=0;
        for (Person person:people){
            Car car=person.getCar();
            if (car.isSport()&&car.getPower()>500){
                count++;
            }
            System.out.println("Количество людей с мощными спортивными автомобилями: " +
                    count);
            break;
        }
        return count;
    }
}
