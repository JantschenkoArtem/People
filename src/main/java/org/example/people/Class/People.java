package org.example.people.Class;

import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;
import org.example.people.ENAM.Country;
import org.example.people.ENAM.Currency;

public class People {
    public static Person[] peopleOfUSA() {
        Person person = new Person("Ivan", "Ivanov", new Address(Country.USA, "Wall Street", 1, 1)
                , 1200, new Car(Brand.BMW, 2, true, 500, 2024, Color.BLACK, 25000), new Account[]{new Account(Currency.USD, 25000, "ID12.12")});
        Person person1 = new Person("Anna", "Ivanova", person.getAddress()
                , 1500, new Car(Brand.BMW, 4, false, 200, 2020, Color.RED, 10000), person.getAccounts());
        Person person2 = new Person("Anton", "Antonov", new Address(Country.USA, "Wall Street", 1, 3), 1500,
                new Car(Brand.BMW, 4, false, 200, 2020, Color.RED, 15000), new Account[]{new Account(Currency.USD, 500000.5, "ID16.61")});
        Person person3 = new Person("Antonina", "Antonova", person2.getAddress(), 2000, person1.getCar(), person2.getAccounts());
        Person[] peopleOfUSA = {person, person1, person3};

        return peopleOfUSA;
    }


    public static Person[] peopleOfUK() {
        Person person = new Person("John", "Johnovitsch", new Address(Country.UK, "Backer Street", 2, 1), 2500,
                new Car(Brand.MERCEDES, 4, true, 600, 2010, Color.BLACK, 50000), new Account[]{new Account(Currency.GBR, 650650, "ID12.12")});
        Person person1 = new Person("Johana", "Johnovitsch", person.getAddress(), 500,
                new Car(Brand.TOYOTA, 4, false, 350, 2024, Color.BLU, 1000), person.getAccounts());
        Person[] peopleOfUK = {person, person1};
        return peopleOfUK;
    }

    public static Person[] peopleOfGermany() {
        Person person = new Person("Adolf", "Hamman", new Address(Country.GERMANY, "Bussenstr.", 3, 1), 2500,
                new Car(Brand.MERCEDES, 2, true, 650, 2024, Color.WIETE, 30000), new Account[]{new Account(Currency.EURO, 150000, "ID.166.65")});

        Person person1 = new Person("Elisabet", "Hamman", new Address(Country.GERMANY, "Bussenstr.", 3, 1), 2500,
                new Car(Brand.MERCEDES, 2, true, 1000, 2024, Color.BLACK, 30000), new Account[]{new Account(Currency.EURO, 150000, "ID.166.66")});
        Person[] peopleOfGermany = {person, person1};
        return peopleOfGermany;
    }

    public static Person[] peopleOfFrance() {
        Person person = new Person("Kruosa", "Timur", new Address(Country.FRANCE, "Lupen", 26, 1), 1000,
                null, null);

        Person person3 = new Person("Jopen", "Timur", new Address(Country.FRANCE, "Lupen", 26, 1), 1000,
                null, null);
        Person person1 = new Person("Popec", "Tildo", new Address(Country.FRANCE, "Lupen", 22, 1), 1000,
                null, null);
        Person person2 = new Person("Youmen", "Bobo", new Address(Country.FRANCE, "Lupen", 20, 1), 1000,
                null, null);
        Person[]peopleOfFrance={person,person1,person2,person3};
        return peopleOfFrance;
    }
}
