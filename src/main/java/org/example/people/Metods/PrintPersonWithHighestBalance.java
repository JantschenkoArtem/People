package org.example.people.Metods;

import org.example.people.Class.Account;
import org.example.people.Class.Person;

/**
 Определить лиц с наибольшим балансом на счету.
 *
 */
public class PrintPersonWithHighestBalance {
    public static void personWithHighestBalance(Person[]people){
        Person richestPerson=null;
        double maxBalance=0;
        for (Person person:people){
            Account[]accounts=person.getAccounts();
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
