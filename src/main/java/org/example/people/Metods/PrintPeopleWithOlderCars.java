package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

import java.util.List;

/**
 * Перечислить всех, у кого автомобиль был выпущен до определенного года.
 */
public class PrintPeopleWithOlderCars {
    public static void PeopleWithOlderCars(List<Person> people, int year) {
        for (Person person : people) {

            Car car = person.getCar();
            if (car==null){
                System.out.println("Person have Not Car: " + person.getFirstName() + " " + person.getLastName());
                continue;
            }
            if (car.getYearOfManufacture() < year) {
                System.out.println("Have oldest: " + year + " Car " + person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
