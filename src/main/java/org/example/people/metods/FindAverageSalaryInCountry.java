package org.example.people.metods;

import org.example.people._class.Person;
import org.example.people.enams.Country;

import java.util.List;

/**
 * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
 */
public class FindAverageSalaryInCountry {

    public static double averageSalary(List<Person>people) {


        double totalSalary = 0;
        int count = 0;
        double averageSalary = 0;
        Country country = null;
        for (Person person : people) {
            totalSalary += person.getSalary();
            count++;
            country = person.getAddress().getCountry();
            averageSalary = totalSalary / count;
        }
        System.out.println("Средняя зарплата в " + country + " = " + averageSalary);

        return averageSalary;
    }

}
