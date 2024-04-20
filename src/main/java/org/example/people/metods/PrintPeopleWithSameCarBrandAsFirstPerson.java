package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Brand;

import java.util.List;

/**
 * Вывести список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве.
 */
public class PrintPeopleWithSameCarBrandAsFirstPerson {
    public static void peopleWithSameCarBrandAsFirstPerson(List<Person>people){
       for (Person person:people){
           Person firstPersonCar=person;
           Brand firstPersonCarBrand=firstPersonCar.getCar().getBrand();
           Car car=person.getCar();
           if (car.getBrand()==firstPersonCarBrand){
               System.out.println("список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве: "
                       + person.getCar().getBrand()+ " " + person.getFirstName() + " " + person.getLastName());
           }
       }
    }
}
