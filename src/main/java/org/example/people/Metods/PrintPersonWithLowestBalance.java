package org.example.people.Metods;

import org.example.people.Class.Account;
import org.example.people.Class.Person;

/**
 * Определить и вывести лицо, имеющего счет с наименьшим балансом. +
 */
public class PrintPersonWithLowestBalance {
    public static void personWithLowestBalance(Person[]people){
        Person personWithLowestBalance=null;
        double minBalance=Double.MAX_VALUE;

        for (Person person:people){
            Account[]accounts=person.getAccounts();
            if (accounts!=null){
                for (Account account:accounts){
                    if (account.getBalance()<minBalance){
                        minBalance=account.getBalance();
                        personWithLowestBalance=person;
                    }
                }
            }

        }
        System.out.println("лицо, имеющего счет с наименьшим балансом: " + personWithLowestBalance.getFirstName()
                + " " + personWithLowestBalance.getLastName());
    }
}
