package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

/**
 * Найти и вывести лиц, чьи автомобили имеют стоимость выше заданной.
 */
public class PrintPeopleWithCarsCostingMoreThan {
    public static void peopleWithCarsCostingMoreThan(Person[]people,int price){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getPrice()>price){
                System.out.println("лицa, чьи автомобили имеют стоимость выше заданной: " +
                        person.getFirstName() + person.getLastName());
            }
        }
    }
}
