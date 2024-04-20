package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Color;

import java.util.List;

/**
 * Найти лиц, у которых есть автомобиль определенного цвета, но не спортивный.
 */
public class PrintPeopleWithSpecificColorNonSportCars {
    public static void peopleWithSpecificColorNonSportCars(List<Person>people, Color color){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getColor()==color&&!car.isSport()){
                System.out.println("лиц, у которых есть автомобиль определенного цвета, но не спортивный: " +
                        person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
