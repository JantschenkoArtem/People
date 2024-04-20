package org.example.people._class;

import org.example.people.enams.Country;

/**
 * Создать класс Address.
 * Поля:
 * - Страна(Энам)
 * - Улица
 * - номер дома
 * - номер квартиры(если живет не в доме а в квартире,
 * если в доме то номер квартиры == 0)
 */
public class Address {
    private Country country;
    private String street;
    private int housesNumber;
    private int floatNumber;

    public Address(Country country, String street, int housesNumber, int floatNumber) {
        this.country = country;
        this.street = street;
        this.housesNumber = housesNumber;
        this.floatNumber = floatNumber;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHousesNumber() {
        return housesNumber;
    }

    public void setHousesNumber(int housesNumber) {
        this.housesNumber = housesNumber;
    }

    public int getFloatNumber() {
        return floatNumber;
    }

    public void setFloatNumber(int floatNumber) {
        this.floatNumber = floatNumber;
    }

    @Override
    public String toString() {
        return "Address: " +
                "country= " + country +
                ", street='" + street + '\'' +
                ", housesNumber= " + housesNumber +
                ", floatNumber= " + floatNumber;
    }
}
