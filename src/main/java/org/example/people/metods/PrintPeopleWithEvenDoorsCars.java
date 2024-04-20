package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;

import java.util.List;

/**
 * Вывести имена и фамилии всех лиц, чьи автомобили имеют четное количество дверей.
 */
public class PrintPeopleWithEvenDoorsCars {

    public static void peopleWithEvenDoorsCars(List<Person> people) {
        for (Person person : people) {
            Car car = person.getCar();
            if (person.getCar() == null) {
                System.out.println("Person have don Car!!!" + person.getFirstName() + " " + person.getLastName());
                continue;
            }

            if (car.getDoors() % 2 == 0) {
                System.out.println("лицa, чьи автомобили имеют четное количество дверей:" +
                        person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
