package org.example.people.Metods;

import org.example.people.Class.*;
import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;

public class Main {
    public static void main(String[] args) {
//        Address address = new Address(Country.USA, "Wall Street", 1, 1);
//        Address address1 = new Address(Country.USA, "Wall Street", 1, 2);
//        Address address2 = new Address(Country.USA, "Wall Street", 1, 3);
//        Address address3 = new Address(Country.USA, "Wall Street", 1, 4);
//        Address address4 = new Address(Country.UK, "Backer Street", 2, 1);
//        Address address5 = new Address(Country.UK, "Backer Street", 2, 2);
//        Address address6 = new Address(Country.UK, "Backer Street", 2, 3);
//        Address address7 = new Address(Country.UK, "Backer Street", 2, 4);
//        Address address8 = new Address(Country.GERMANY, "BussenStr.", 3, 1);
//        Address address9 = new Address(Country.GERMANY, "BussenStr.", 3, 2);
//        Address address10 = new Address(Country.GERMANY, "BussenStr.", 3, 3);
//        Address address11 = new Address(Country.GERMANY, "BussenStr.", 3, 4);
//        Address address12 = new Address(Country.CANADA, "Wall Street", 4, 1);
//        Address address13 = new Address(Country.FRANCE, "Wall Street", 4, 2);
//        Address[] addresses = {address, address2, address3, address4, address5, address6, address7, address8, address9, address10, address11, address12, address13};
//
//        Car car = new Car(Brand.BMW, 2, true, 500, 2022, Color.BLACK);
//        Car car1 = new Car(Brand.BMW, 4, false, 200, 2020, Color.RED);
//        Car car2 = new Car(Brand.BMW, 4, true, 400, 2022, Color.RED);
//        Car car3 = new Car(Brand.MERCEDES, 4, true, 600, 2010, Color.BLACK);
//        Car car4 = new Car(Brand.MERCEDES, 4, true, 600, 1980, Color.WIETE);
//        Car car5 = new Car(Brand.LADA, 4, false, 100, 2022, Color.RED);
//        Car car6 = new Car(Brand.MAZDA, 2, true, 400, 2021, Color.WIETE);
//        Car car7 = new Car(Brand.TOYOTA, 4, false, 350, 2024, Color.BLU);
//        Car[] cars = {car, car1, car2, car3, car4, car5, car6, car7};
//
//
//        Account account = new Account(Currency.USD, 25000.99, "ID12.12");
//        Account account1 = new Account(Currency.USD, 500000.5, "ID16.61");
//        Account account2 = new Account(Currency.EURO, 12000, "ID.Privet");
//        Account account3 = new Account(Currency.EURO, 242500, "ID123456");
//        Account account4 = new Account(Currency.CAD, 40500, "ID999");
//        Account account5 = new Account(Currency.GBR, 650650, "ID12.12");
//        Account[] accounts = {account, account1, account2, account3, account4, account5};


        FindAverageSalaryInCountry.averageSalary(People.PeopleOfUSA());
        FindAverageSalaryInCountry.averageSalary(People.PeopleOfUK());
//
//        IsRedIsSport.IsNotRedNotSport(People.PeopleOfUSA());
//        IsRedIsSport.IsNotRedNotSport(People.PeopleOfUK());
//
//        PrintPeopleWithBalanceOver.peopleWithBalanceOver(People.PeopleOfUK(),Currency.GBR,1000000);
//        PrintPeopleWithBalanceOver.peopleWithBalanceOver(People.PeopleOfUSA(),Currency.USD,100000);
//
//        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.PeopleOfUSA(),2022);
//        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.PeopleOfUSA(),2000);
//        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.PeopleOfUK(),2024);
//
//

        System.out.println("Количество людей с мощными спортивными автомобилями: " +
                CountPeopleWithPowerfulSportsCars.PeopleWithPowerfulSportsCars(People.PeopleOfUSA()));

        System.out.println("Количество людей с мощными спортивными автомобилями: " +
                CountPeopleWithPowerfulSportsCars.PeopleWithPowerfulSportsCars(People.PeopleOfUK()));

        PrintPeopleWithMostPowerfulCars.peopleWithMostPowerfulCars(People.PeopleOfUK());
        PrintPeopleWithMostPowerfulCars.peopleWithMostPowerfulCars(People.PeopleOfUSA());

        PrintPeopleLivingInHousesEndingWith1.peopleLivingInHousesEndingWith1(People.PeopleOfUSA());
        PrintPeopleLivingInHousesEndingWith1.peopleLivingInHousesEndingWith1(People.PeopleOfUK());

        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.PeopleOfUK(), Brand.BMW, Color.WIETE);
        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.PeopleOfUK(), Brand.MERCEDES, Color.WIETE);
        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.PeopleOfUK(), Brand.MERCEDES, Color.BLACK);

        PrintPeopleWithAboveAverageSalary.peopleWithAboveAverageSalary(People.PeopleOfUSA());
        PrintPeopleWithAboveAverageSalary.peopleWithAboveAverageSalary(People.PeopleOfUK());

        PrintPersonWithHighestBalance.personWithHighestBalance(People.PeopleOfUSA());
        PrintPersonWithHighestBalance.personWithHighestBalance(People.PeopleOfUK());

        PrintPeopleWithNewCars.peopleWithNewCars(People.PeopleOfUK());
        PrintPeopleWithNewCars.peopleWithNewCars(People.PeopleOfUSA());

    }


}
