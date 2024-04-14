package org.example.people.Metods;

import org.example.people.Class.Car;
import org.example.people.Class.Person;
import org.example.people.ENAM.Color;

/**
 * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
 */
public class IsRedIsSport {
    public static boolean IsSport(Person[]people){
        for (Person person:people){
            Car car=person.getCar();
            if ( car.isSport()){
                System.out.println(person.getFirstName());
            }
        }
        return true;
    }
    public static boolean IsRed(Person[]people){
        for (Person person:people){
            Car car=person.getCar();
            if (car.getColor()==Color.RED){
                System.out.println(person.getFirstName());
            }
        }
        return true;
    }
    public static boolean IsNotRedNotSport(Person[]people){
        for (Person person:people){
            Car car=person.getCar();
            if (!car.isSport() && car.getColor()!=Color.RED){
                System.out.println(person.getFirstName());
            }
        }
        return true;
    }
}
