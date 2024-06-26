package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;

import java.util.List;

/**
 * Найти и вывести лиц, чьи автомобили имеют стоимость выше заданной.
 */
public class PrintPeopleWithCarsCostingMoreThan {
    public static void peopleWithCarsCostingMoreThan(List<Person>people, int price){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getPrice()>price){
                System.out.println("лицa, чьи автомобили имеют стоимость выше заданной: " +
                        person.getFirstName() + person.getLastName());
            }
        }
    }
}
