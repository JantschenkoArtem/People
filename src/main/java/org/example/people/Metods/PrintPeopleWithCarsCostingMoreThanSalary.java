package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;

import java.util.List;

/**
 Вывести список лиц, имеющих автомобили, которые стоят дороже их зарплаты.
 *
 */
public class PrintPeopleWithCarsCostingMoreThanSalary {
    public static void peopleWithCarsCostingMoreThanSalary(List<Person>people){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getPrice()>person.getSalary()){
                System.out.println("список лиц, имеющих автомобили, которые стоят дороже их зарплаты: "
                         + person.getFirstName() + " " + person.getLastName());
            }
        }
    }
}
