package org.example.people.Class;

import java.util.List;

/**
 * Создать класс Person.
 * Поля:
 * - имя
 * - фамилия
 * - адрес(это отдельный класс)
 * - зарплата
 * - авто(это отдельный класс)
 * - массив счетов(отдельный клас)
 */
public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private int salary;
    private Car car;
    private List<Account> accounts;

    public Person(String firstName, String lastName, Address address, int salary, Car car, List<Account> accounts) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.salary = salary;
        this.car = car;
        this.accounts = accounts;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account>accounts) {
        this.accounts = accounts;
    }
}
