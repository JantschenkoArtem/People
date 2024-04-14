package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

public class PrintPeopleWithMostPowerfulCars {
    public static void peopleWithMostPowerfulCars(Person[] people) {
        Person mostPowerSportCar = null;
        Person mostPowerNotSportCar = null;
        int maxPowerSport = 0;
        int maxPowerNotSport = 0;
        for (Person person : people) {
            Car car = person.getCar();
            if (car.isSport() && car.getPower() > maxPowerSport) {
                maxPowerSport = car.getPower();
                mostPowerSportCar = person;
            } else if (!car.isSport() && car.getPower() > maxPowerNotSport) {
                maxPowerNotSport = car.getPower();
                mostPowerNotSportCar = person;
            }
        }
        System.out.println("Самый мощный спортивный автомобиль у: "
                + mostPowerSportCar.getFirstName()
                + " " + mostPowerSportCar.getLastName());
        System.out.println("Самый мощный неспортивный автомобиль у: "
                + mostPowerNotSportCar.getFirstName()
                + " " + mostPowerNotSportCar.getLastName());
    }
}
