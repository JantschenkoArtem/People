package org.example.people;

import org.example.people._class.People;
import org.example.people._class.Person;
import org.example.people.allMethods.AllMethods;
import org.example.people.enams.Currency;
import org.example.people.metods.PrintPeopleWithMostPowerfulCars;

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
        AllMethods.peopleOfStreetBurDifferentHouses(People.peopleOfUSA());
        AllMethods.peopleOfStreetBurDifferentHouses(People.peopleOfGermany());
        System.out.println();

        AllMethods.peopleWithoutCars(People.peopleOfGermany());
        AllMethods.peopleWithoutCars(People.peopleOfFrance());

        System.out.println();
        AllMethods.countPeopleWithPowerfulSportsCars(People.peopleOfFrance());
        AllMethods.countPeopleWithPowerfulSportsCars(People.peopleOfGermany());
        System.out.println();

//        PrintPeopleWithMostPowerfulCars.peopleWithMostPowerfulCars(People.peopleOfGermany());

     AllMethods.printPeopleWithMostPowerfulCarsByClass(People.peopleOfGermany());
     AllMethods.printPeopleWithMostPowerfulCarsByClass(People.peopleOfUSA());
     AllMethods.printPeopleWithMostPowerfulCarsByClass(People.peopleOfUK());

    }
}
