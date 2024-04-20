package org.example.people.metods;

import org.example.people._class.Account;
import org.example.people._class.Person;
import org.example.people.enams.Currency;

import java.util.List;

/**
 Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.
 *
 */
public class PrintPeopleWithBalanceOver {
    public static void peopleWithBalanceOver(List<Person>people, Currency currency, double balance) {
        for (Person person : people) {


            List<Account>accounts=person.getAccounts();
            if (accounts==null){
                System.out.println("Person have not Account: " + person.getFirstName() + " " + person.getLastName());
            continue;
            }
            for (Account account : accounts) {
                if (account.getCurrency() == currency && account.getBalance() > balance) {
                    System.out.println(person.getFirstName() + " " + person.getLastName() +" with balance > " + balance);
                }
                if(account.getBalance()<balance){
                    System.out.println(person.getFirstName() + " " + person.getLastName() +" with balance < " + balance);
                }
            }
        }

    }
}
