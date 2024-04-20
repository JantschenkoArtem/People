package org.example.people.metods;

import org.example.people._class.Person;

import java.util.List;

public class FindPeopleOfStreet {
    public static void peopleOfStreet(List<Person>people, String address){
        for (Person person:people){
            String addresses=person.getAddress().getStreet();
            if (person.getAddress().getStreet()==addresses){
                System.out.println(person.getFirstName() + person.getLastName());
            }
        }

    }
}
