package org.example.people.allMethods;

import org.example.people._class.Account;
import org.example.people._class.Address;
import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Color;
import org.example.people.enams.Country;
import org.example.people.enams.Currency;

import java.util.List;

public class AllMethods {
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
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
        int count = 0;
        for (Person person : people) {
            totalSalary += person.getSalary();
            country = person.getAddress().getCountry();
            count++;
            averageSalary = totalSalary / count;
        }
        System.out.println("Average salary in: " + country + " = " + averageSalary);
    }

    /**
     * Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.
     */

    public static void peopleWithBalanceOver(List<Person> people, Currency currency, double balance) {

        for (Person person : people) {
            List<Account> accountList = person.getAccounts();
            if (accountList == null) {
                System.out.println(person.getFirstName() + " " + person.getLastName() + " have not Account");
            }

            assert accountList != null;
            for (Account account : accountList) {

                if (account.getBalance() > balance && account.getCurrency() == currency) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " with balance > " + balance);
                }
                if (account.getBalance() < balance) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() + " with balance < " + balance);
                }
            }
        }

    }

    /**
     * Перечислить всех, у кого автомобиль был выпущен до определенного года.
     */

    public static void peopleWithOlderCars(List<Person> people, int year) {
        for (Person person : people) {
            Car car = person.getCar();

            if (car == null) {
                System.out.println("Person have Not Car: " + person.getFirstName() + " " + person.getLastName());
                continue;
            }
            if (car.getYearOfManufacture() < year) {
            }
            System.out.println("Have oldest: " + year + " Car " + person.getFirstName() + " " + person.getLastName());
        }
    }

    /**
     * Найти лиц, живущих на одной улице, но в разных домах. +
     */
    public static void peopleOfStreetBurDifferentHouses(List<Person> people) {
//        String street;
//        int housesNumber;
//        for (Person person : people) {
//            street=person.getAddress().getStreet();
//            housesNumber=person.getAddress().getHousesNumber();
//            if (person.getAddress().getStreet()==street && person.getAddress().getHousesNumber()!=housesNumber){
//                System.out.println(person.getFirstName());
//            }
//        }
        for (Person person1 : people) {
            for (Person person2 : people) {
                if (person1.getAddress().getStreet().equals(person2.getAddress().getStreet())
                        && person1.getAddress().getHousesNumber() != person2.getAddress().getHousesNumber()) ;

                System.out.println("this people Living On Same Street But Different Houses : " + person1.getFirstName() +
                        " " + person1.getLastName() + " and " + person2.getFirstName() + " " + person2.getLastName());
            }
        }
    }

    /**
     * Вывести список всех лиц без автомобилей (предполагая, что авто может быть null)
     */

    public static void peopleWithoutCars(List<Person> people) {
        for (Person person : people) {
            if (person.getCar() == null) {
                System.out.println(person.getFirstName() +
                        " " + person.getLastName() + " have not Car");
            }
        }
    }

    /**
     * Определить количество лиц, имеющих спортивный автомобиль с мощностью более 300 л.с. +
     * ???
     */
    public static void countPeopleWithPowerfulSportsCars(List<Person> people) {
        int count = 0;
        for (Person person : people) {
            if (person.getCar() != null
                    && person.getCar().getPower() > 300) {
                count++;
            }
            System.out.println("People from " + person.getAddress().getCountry() + " with powerful SportsCars over 300 : " + count);
        }
    }

    /**
     * Вывести список лиц, чьи автомобили являются наиболее мощными в своем классе (спортивные/неспортивные).
     */
    public static void printPeopleWithMostPowerfulCarsByClass(List<Person> people) {
//        Person mostPowerfulSportsCarOwner = null;
//        Person mostPowerfulNonSportsCarOwner = null;
//        for (Person person : people) {
//            Car car=person.getCar();
//            if (car!=null&& !car.isSport()&&car.getPower()>mostPowerfulNonSportsCarOwner.getCar().getPower()){
//                mostPowerfulNonSportsCarOwner=person;
//            }
//            if (car.isSport()&&car.getPower()>mostPowerfulSportsCarOwner.getCar().getPower()){
//                mostPowerfulSportsCarOwner=person;
//            }
//            System.out.println("People With Most Powerful Cars By Class Sport " + mostPowerfulSportsCarOwner.getFirstName()
//                    + " " + mostPowerfulNonSportsCarOwner.getLastName());
//        }
        for (Person person1 : people) {
            for (Person person2 : people) {
                if (person1.getCar() != null && person2.getCar() != null
                        && person1.getCar().getPower() > person2.getCar().getPower()
                        && person1.getCar().isSport() && person2.getCar().isSport()) {

                    System.out.println("PeopleWithMostPowerfulCarsByClass " + person1.getFirstName());

                }
                if (person1.getCar()!=null&&person2.getCar()!=null
                &&person1.getCar().getPower()>person2.getCar().getPower()
                &&!person1.getCar().isSport()&&!person2.getCar().isSport()){
                    System.out.println("PeopleWithMostPowerfulCarsByClass not sport " + person1.getFirstName());

                }
            }
        }
    }
}
