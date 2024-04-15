package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;
import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;

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
