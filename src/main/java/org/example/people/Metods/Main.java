package org.example.people.Metods;

import org.example.people.Class.*;
import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;
import org.example.people.ENAM.Country;
import org.example.people.ENAM.Currency;

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


//        FindAverageSalaryInCountry.averageSalary(People.peopleOfUSA());
        FindAverageSalaryInCountry.averageSalary(People.peopleOfGermany());
        FindAverageSalaryInCountry.averageSalary(People.peopleOfUK());
        FindAverageSalaryInCountry.averageSalary(People.peopleOfFrance());
        FindAverageSalaryInCountry.averageSalary(People.peopleOfUSA());
//
//        IsRedIsSport.IsNotRedNotSport(People.peopleOfUSA());
//        IsRedIsSport.IsNotRedNotSport(People.peopleOfUK());

////        PrintPeopleWithBalanceOver.peopleWithBalanceOver(People.peopleOfUSA(), Currency.USD,1000000);
////        PrintPeopleWithBalanceOver.peopleWithBalanceOver(People.peopleOfUK(),Currency.GBR,100000);
////
////        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.peopleOfUSA(),2022);
////        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.peopleOfFrance(),2000);
////        PrintPeopleWithOlderCars.PeopleWithOlderCars(People.peopleOfUK(),2024);
//
//
//
//        System.out.println("Количество людей с мощными спортивными автомобилями: " +
//                CountPeopleWithPowerfulSportsCars.PeopleWithPowerfulSportsCars(People.peopleOfUSA()));
//
//        System.out.println("Количество людей с мощными спортивными автомобилями: " +
//                CountPeopleWithPowerfulSportsCars.PeopleWithPowerfulSportsCars(People.peopleOfUK()));
//
//        PrintPeopleWithMostPowerfulCars.peopleWithMostPowerfulCars(People.peopleOfUK());
//        PrintPeopleWithMostPowerfulCars.peopleWithMostPowerfulCars(People.peopleOfUSA());
//
//        PrintPeopleLivingInHousesEndingWith1.peopleLivingInHousesEndingWith1(People.peopleOfUSA());
//        PrintPeopleLivingInHousesEndingWith1.peopleLivingInHousesEndingWith1(People.peopleOfUK());
//
//        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.peopleOfUK(), Brand.BMW, Color.WIETE);
//        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.peopleOfUK(), Brand.MERCEDES, Color.WIETE);
//        PrintPeopleWithSpecificCar.peopleWithSpecificCar(People.peopleOfUK(), Brand.MERCEDES, Color.BLACK);
//
//        PrintPeopleWithAboveAverageSalary.peopleWithAboveAverageSalary(People.peopleOfUSA());
//        PrintPeopleWithAboveAverageSalary.peopleWithAboveAverageSalary(People.peopleOfUK());
//
//        PrintPersonWithHighestBalance.personWithHighestBalance(People.peopleOfUSA());
//        PrintPersonWithHighestBalance.personWithHighestBalance(People.peopleOfUK());
//
//        PrintPeopleWithNewCars.peopleWithNewCars(People.peopleOfUK());
//        PrintPeopleWithNewCars.peopleWithNewCars(People.peopleOfUSA());
//
//        PrintPeopleWithSpecificColorNonSportCars.peopleWithSpecificColorNonSportCars(People.peopleOfUSA(),Color.WIETE);
//        PrintPeopleWithSpecificColorNonSportCars.peopleWithSpecificColorNonSportCars(People.peopleOfUSA(),Color.BLACK);
//        PrintPeopleWithSpecificColorNonSportCars.peopleWithSpecificColorNonSportCars(People.peopleOfUSA(),Color.RED);
//
//
//        PrintPeopleWithCarsCostingMoreThan.peopleWithCarsCostingMoreThan(People.peopleOfUSA(),15000);
//        PrintPeopleWithCarsCostingMoreThan.peopleWithCarsCostingMoreThan(People.peopleOfUK(),15000);
//
//        PrintPeopleWithEvenDoorsCars.peopleWithEvenDoorsCars(People.peopleOfUK());
//        PrintPeopleWithEvenDoorsCars.peopleWithEvenDoorsCars(People.peopleOfUSA());
//
//        PrintPersonWithLowestBalance.personWithLowestBalance(People.peopleOfUSA());
//        PrintPersonWithLowestBalance.personWithLowestBalance(People.peopleOfUK());
//
//        PrintPeopleWithCarsCostingMoreThanSalary.peopleWithCarsCostingMoreThanSalary(People.peopleOfUK());
//        PrintPeopleWithCarsCostingMoreThanSalary.peopleWithCarsCostingMoreThanSalary(People.peopleOfUSA());
//
//        PrintPeopleWithSameCarBrandAsFirstPerson.peopleWithSameCarBrandAsFirstPerson(People.peopleOfUK());
//        PrintPeopleWithSameCarBrandAsFirstPerson.peopleWithSameCarBrandAsFirstPerson(People.peopleOfUSA());
//
//
//
//


    }


}
