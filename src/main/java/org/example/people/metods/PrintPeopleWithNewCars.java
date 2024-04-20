package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;

import java.util.List;

/**
 * список лиц, чьи автомобили были куплены новыми (год выпуска авто равен текущему году)
 */
public class PrintPeopleWithNewCars {
    public static void peopleWithNewCars(List<Person> people) {

        //int currentYear=Year.now().getValue() ;

        int currentYear = 2024;
        for (Person person : people) {
            Car car = person.getCar();
            if (car.getYearOfManufacture() == currentYear) {
                System.out.println("список лиц, чьи автомобили были куплены новыми " +
                                "(год выпуска авто равен текущему году): " +
                        person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
