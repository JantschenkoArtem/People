package org.example.people.metods;

import org.example.people._class.Account;
import org.example.people._class.Person;

import java.util.List;

/**
 Определить лиц с наибольшим балансом на счету.
 *
 */
public class PrintPersonWithHighestBalance {
    public static void personWithHighestBalance(List<Person>people){
        Person richestPerson=null;
        double maxBalance=0;
        for (Person person:people){
            List<Account>accounts=person.getAccounts();
            if (accounts!=null){
                for (Account account:accounts){
                    if (account.getBalance()>maxBalance){
                        maxBalance=account.getBalance();
                        richestPerson=person;
                    }
                }
            }
        }
        System.out.println("лицo с наибольшим балансом на счету:" + richestPerson.getFirstName()
               + " " + richestPerson.getLastName());
    }


}
