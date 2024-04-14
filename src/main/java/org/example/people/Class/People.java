package org.example.people.Class;

import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;
import org.example.people.ENAM.Country;
import org.example.people.ENAM.Currency;

import java.util.Arrays;

public class People {
    public static Person[]PeopleOfUSA() {
        Person person = new Person("Ivan", "Ivanov", new Address(Country.USA, "Wall Street", 1, 1)
                , 1200, new Car(Brand.BMW, 2, true, 500, 2024, Color.BLACK,25000), new Account[]{new Account(Currency.USD, 25000.99, "ID12.12")});
        Person person1 = new Person("Anna", "Ivanova", person.getAddress()
                , 1200, new Car(Brand.BMW, 4, false, 200, 2020, Color.RED,10000), person.getAccounts());
        Person person2 = new Person("Anton", "Antonov", new Address(Country.USA, "Wall Street", 1, 3), 1500,
                new Car(Brand.BMW, 4, false, 200, 2020, Color.RED,15000), new Account[]{new Account(Currency.USD, 500000.5, "ID16.61")});
        Person person3 = new Person("Antonina", "Antonova", person2.getAddress(), 2000, person1.getCar(), person2.getAccounts());
        Person[] peopleOfUSA = {person, person1, person3};

        return peopleOfUSA;
    }


    public static Person[] PeopleOfUK() {
        Person person = new Person("John", "Johnovitsch", new Address(Country.UK, "Backer Street", 2, 1), 2500,
                new Car(Brand.MERCEDES, 4, true, 600, 2010, Color.BLACK,50000), new Account[]{new Account(Currency.GBR, 650650, "ID12.12")});
        Person person1 = new Person("Johana", "Johnovitsch", person.getAddress(), 500,
                new Car(Brand.TOYOTA, 4, false, 350, 2024, Color.BLU,1000), person.getAccounts());
        Person[] peopleOfUK = {person, person1};
        return peopleOfUK;
    }


}
