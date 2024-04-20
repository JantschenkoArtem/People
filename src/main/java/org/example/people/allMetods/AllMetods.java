package org.example.people.allMetods;

import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Color;
import org.example.people.enams.Country;

import java.util.List;

public class AllMetods {
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
     *
     * @param people
     */
    public static void isNotRedAndNotSportCar(List<Person> people) {
        for (Person person : people) {
            if (person.getCar() == null) {
                System.out.println(person.getFirstName() + " " + person.getLastName() + " have not car ! ");
                continue;
            }
            Car car = person.getCar();
            if (!car.isSport() && car.getColor() != Color.RED) {
                System.out.println(person.getFirstName() + " " + person.getLastName() + " have not sport and not red car ! ");
            } else {
                System.out.println(person.getFirstName() + " " + person.getLastName() + " have sport and red car ! ");
            }
        }
    }

    /**
     * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране. +
     */
    public static void averageSalaryInCountry(List<Person> people) {
        double totalSalary = 0;
        double averageSalary = 0;
        Country country = null;
        int count=0;
        for (Person person : people) {
            totalSalary += person.getSalary();
            country = person.getAddress().getCountry();
            count++;
            averageSalary=totalSalary/count;
        }
        System.out.println("Average salary in: " + country + " = " + averageSalary);
    }


}
