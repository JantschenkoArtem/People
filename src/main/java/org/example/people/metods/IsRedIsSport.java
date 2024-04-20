package org.example.people.metods;

import org.example.people._class.Car;
import org.example.people._class.Person;
import org.example.people.enams.Color;

import java.util.List;

/**
 * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
 */
public class IsRedIsSport {
    public static boolean IsSport(List<Person>people){
        for (Person person:people){
            Car car=person.getCar();
            if ( car.isSport()){
                System.out.println(person.getFirstName() + " " +
                        person.getLastName() + " have Sport Car ");
            }
        }
        return true;
    }
    public static boolean IsRed(List<Person>people){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getColor()==Color.RED){
                System.out.println(person.getFirstName() + " " +
                        person.getLastName() + " have Red Car ");
            }
        }
        return true;
    }
    public static void IsNotRedNotSport(List<Person>people){
        for (Person person:people){
            if (person.getCar()==null){

                System.out.println("Person have not Car: " + person.getFirstName() + " " + person.getLastName());
                continue;
            }

            Car car=person.getCar();
               if (car.getColor()!=Color.RED){
                   System.out.println("Person have not red Car: " + person.getFirstName() + " " + person.getLastName());
               }
            if (!car.isSport() && car.getColor()!=Color.RED){
                System.out.println(person.getFirstName() + " " +
                        person.getLastName() + " have Sport and Red Car ");
            }
        }
    }
}
