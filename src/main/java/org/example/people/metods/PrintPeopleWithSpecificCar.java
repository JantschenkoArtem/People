package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Brand;
import org.example.people.enams.Color;

import java.util.List;

/**
 * Найти лиц с автомобилями определенной марки и цвета.
 */
public class PrintPeopleWithSpecificCar {
    public static void peopleWithSpecificCar(List<Person> people, Brand carBrand, Color color) {
        for (Person person : people) {
            Car car = person.getCar();
            if (car.getBrand() == carBrand && car.getColor() == color) {
                System.out.println("лицa с автомобилями определенной марки и цвета: "
                        + person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
