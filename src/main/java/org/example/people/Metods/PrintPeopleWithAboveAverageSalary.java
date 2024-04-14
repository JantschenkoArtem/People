package org.example.people.Metods;

import org.example.people.Class.People;
import org.example.people.Class.Person;

/**
 * Вывести имена лиц, у которых зарплата выше среднего по массиву.
 */
public class PrintPeopleWithAboveAverageSalary {
    public static void peopleWithAboveAverageSalary(Person[] people) {
        double totalSalary = 0;
        for (Person person : people) {
            totalSalary += person.getSalary();
        }
        double averageSalary = totalSalary / people.length + 1;

        for (Person person : people) {
            if (person.getSalary() > averageSalary) {
                System.out.println("лицa, у которых зарплата выше среднего по массиву: " +
                        person.getFirstName() + " " + person.getLastName());
            }


        }
    }
}
