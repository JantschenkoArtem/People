package org.example.people.Metods;

import org.example.people.Class.Person;

import java.util.List;

/**
 * Вывести всех лиц, живущих в домах, номера которых заканчиваются на "1".
 */
public class PrintPeopleLivingInHousesEndingWith1 {
    public static void peopleLivingInHousesEndingWith1(List<Person> people) {
        for (Person person : people) {
            if (person.getAddress().getHousesNumber() == 1) {
                System.out.println(
                        "лицa, живущиe в домах, номера которых заканчиваются на 1: "
                                + person.getFirstName() + person.getLastName());
            }
        }
    }
}
