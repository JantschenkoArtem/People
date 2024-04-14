package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

/**
 Перечислить всех, у кого автомобиль был выпущен до определенного года.
 *
 */
public class PrintPeopleWithOlderCars {
    public static void PeopleWithOlderCars(Person[]people,int year){
        for (Person person:people){
            Car car= person.getCar();
            if (car.getYearOfManufacture()<year){
                System.out.println(person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
