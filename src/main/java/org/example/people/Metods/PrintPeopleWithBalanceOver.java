package org.example.people.Metods;

import org.example.people.Class.Account;
import org.example.people.Class.Person;
import org.example.people.ENAM.Currency;

import java.util.List;

/**
 Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.
 *
 */
public class PrintPeopleWithBalanceOver {
    public static void peopleWithBalanceOver(List<Person>people, Currency currency, double balance) {
        for (Person person : people) {
            List<Account>accounts=person.getAccounts();
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
