package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;

import java.util.List;

public class PrintPeopleWithMostPowerfulCars {
    public static void peopleWithMostPowerfulCars(List<Person> people) {
        Person mostPowerSportCar = null;
        Person mostPowerNotSportCar = null;
        int maxPowerSport = 0;
        int maxPowerNotSport = 0;

        for (Person person : people) {
        if (person.getCar()==null){
            System.out.println("not");
            continue;
        }

            Car car = person.getCar();
            if (car.isSport() && car.getPower() > maxPowerSport) {
                maxPowerSport = car.getPower();
                mostPowerSportCar = person;
            } else if (!car.isSport() && car.getPower() > maxPowerNotSport) {
                maxPowerNotSport = car.getPower();
                mostPowerNotSportCar = person;
            }
        }
        assert mostPowerSportCar != null;
        System.out.println("Самый мощный спортивный автомобиль у: "
                + mostPowerSportCar.getFirstName()
                + " " + mostPowerSportCar.getLastName());
        assert mostPowerNotSportCar != null;
        System.out.println("Самый мощный неспортивный автомобиль у: "
                + mostPowerNotSportCar.getFirstName()
                + " " + mostPowerNotSportCar.getLastName());
    }
}
