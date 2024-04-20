package org.example.people._class;

import org.example.people.enams.Brand;
import org.example.people.enams.Color;
import org.example.people.enams.Country;
import org.example.people.enams.Currency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People {
    public static List<Person> peopleOfUSA() {
        ArrayList<Account> accounts=new ArrayList<>();
        Account account=new Account(Currency.USD,250_000,"ID.16.25");
        accounts.add(account);
        Person person = new Person("Ivan", "Ivanov", new Address(Country.USA, "Wall Street", 1, 1)
                , 1200, new Car(Brand.BMW, 2, true, 500, 2024, Color.BLACK, 25_000),accounts);
        Person person1 = new Person("Anna", "Ivanova", person.getAddress()
                , 1500, new Car(Brand.BMW, 4, false, 200, 2020, Color.RED, 10_000), person.getAccounts());
        Person person2 = new Person("Anton", "Antonov", new Address(Country.USA, "Wall Street", 1, 3), 1500,
                new Car(Brand.BMW, 4, false, 200, 2020, Color.RED, 15_000), accounts);
        Person person3 = new Person("Antonina", "Antonova", person2.getAddress(), 2000, person1.getCar(), person2.getAccounts());
        List<Person> peopleOfUSA = Arrays.asList(person,person1,person2,person3);

        return peopleOfUSA;
    }


    public static List<Person> peopleOfUK() {
        ArrayList<Account> accounts=new ArrayList<>();
        Account account=new Account(Currency.GBR,25_000,"ID.16.25");
        accounts.add(account);
        Person person = new Person("John", "Johnovitsch", new Address(Country.UK, "Backer Street", 2, 1), 2500,
                new Car(Brand.MERCEDES, 4, true, 600, 2010, Color.BLACK, 50_000),accounts);
        Person person1 = new Person("Johana", "Johnovitsch", person.getAddress(), 500,
                new Car(Brand.TOYOTA, 4, false, 350, 2024, Color.BLU, 1000), person.getAccounts());
        List<Person> peopleOfUK = Arrays.asList(person,person1);
        return peopleOfUK;
        // return Arrays.asList(person,person1);
    }

    public static List<Person> peopleOfGermany() {
        ArrayList<Account> accounts=new ArrayList<>();
        Account account=new Account(Currency.EURO,50_000,"ID.25");
        accounts.add(account);
        Person person = new Person("Adolf", "Hamman", new Address(Country.GERMANY, "Bussenstr.", 3, 1), 2500,
                new Car(Brand.MERCEDES, 2, true, 650, 2024, Color.WIETE, 30_000), accounts);

        Person person1 = new Person("Elisabet", "Hamman", new Address(Country.GERMANY, "Bussenstr.", 3, 1), 2500,
                new Car(Brand.MERCEDES, 2, true, 1000, 2024, Color.BLACK, 30_000),accounts);
        return Arrays.asList(person,person1);
    }

    public static List<Person> peopleOfFrance() {
        ArrayList<Account> accounts=new ArrayList<>();
        Account account=new Account(Currency.GBR,10_000,"ID.16");
        accounts.add(account);
        Person person = new Person("Kruosa", "Timur", new Address(Country.FRANCE, "Lupen", 26, 1), 1000,
                null, null);

        Person person3 = new Person("Jopen", "Timur", new Address(Country.FRANCE, "Lupen", 26, 1), 1000,
                null, null);
        Person person1 = new Person("Popec", "Tildo", new Address(Country.FRANCE, "Lupen", 22, 1), 1000,
                null, null);
        Person person2 = new Person("Youmen", "Bobo", new Address(Country.FRANCE, "Lupen", 20, 1), 1000,
                null, null);
        List<Person> peopleOfFrance=Arrays.asList(person,person1,person2,person3);
        return peopleOfFrance;
    }
}
