package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;
import org.example.people.ENAM.Color;

/**
 * Найти лиц, у которых есть автомобиль определенного цвета, но не спортивный.
 */
public class PrintPeopleWithSpecificColorNonSportCars {
    public static void peopleWithSpecificColorNonSportCars(Person[]people, Color color){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getColor()==color&&!car.isSport()){
                System.out.println("лиц, у которых есть автомобиль определенного цвета, но не спортивный: " +
                        person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
