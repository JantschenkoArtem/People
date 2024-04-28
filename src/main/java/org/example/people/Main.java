package org.example.people;

import org.example.people._class.People;
import org.example.people._class.Person;
import org.example.people.allMethods.AllMethods;
import org.example.people.enams.Currency;

public class Main {
    public static void main(String[] args) {

        AllMethods.isNotRedAndNotSportCar(People.peopleOfUSA());
        System.out.println();

        AllMethods.peopleWithBalanceOver(People.peopleOfUSA(),Currency.USD,100_000.00);
        System.out.println();

        AllMethods.averageSalaryInCountry(People.peopleOfUSA());
        System.out.println();

        AllMethods.peopleWithOlderCars(People.peopleOfFrance(),1999);
        AllMethods.peopleWithOlderCars(People.peopleOfUSA(),1999);


        System.out.println();
        AllMethods.peopleOfStreet(People.peopleOfUSA());
        AllMethods.peopleOfStreet(People.peopleOfGermany());

    }
}
