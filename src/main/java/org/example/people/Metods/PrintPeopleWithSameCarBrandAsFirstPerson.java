package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;
import org.example.people.ENAM.Brand;

/**
 * Вывести список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве.
 */
public class PrintPeopleWithSameCarBrandAsFirstPerson {
    public static void peopleWithSameCarBrandAsFirstPerson(Person[]people){
       for (Person person:people){
           Person firstPersonCar=people[0];
           Brand firstPersonCarBrand=firstPersonCar.getCar().getBrand();
           Car car=person.getCar();
           if (car.getBrand()==firstPersonCarBrand){
               System.out.println("список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве: "
                       + person.getCar().getBrand()+ " " + person.getFirstName() + " " + person.getLastName());
           }
       }
    }
}
