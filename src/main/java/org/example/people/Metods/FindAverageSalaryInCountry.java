package org.example.people.Metods;

import org.example.people.Class.People;
import org.example.people.Class.Person;
import org.example.people.ENAM.Country;

/**
 * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
 */
public class FindAverageSalaryInCountry {

    public static int averageSalary(Person[] people) {

        int totalSalary = 0;
        for (int i = 0; i < people.length; i++) {
            totalSalary += people[i].getSalary();
        }
        System.out.println("averageSalary= " + totalSalary / people.length + 1);
        return totalSalary;
    }
}
