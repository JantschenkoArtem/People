package org.example.people.Metods;

import org.example.people.Class.Account;
import org.example.people.Class.Person;

import java.util.List;

/**
 * Определить и вывести лицо, имеющего счет с наименьшим балансом. +
 */
public class PrintPersonWithLowestBalance {
    public static void personWithLowestBalance(List<Person>people){
        Person personWithLowestBalance=null;
        double minBalance=Double.MAX_VALUE;

        for (Person person:people){

            List<Account>accounts=person.getAccounts();
        if (accounts==null){
            System.out.println("Person have not Account: " + person.getFirstName() + " " + person.getLastName());
            continue;
        }
            for (Account account : accounts) {
                if (account.getBalance() < minBalance) {
                    minBalance = account.getBalance();
                    personWithLowestBalance = person;
                }
            }
            System.out.println("лицо, имеющего счет с наименьшим балансом: " + personWithLowestBalance.getFirstName()
                    + " " + personWithLowestBalance.getLastName());
        }

    }
}
