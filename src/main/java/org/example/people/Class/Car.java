package org.example.people.Class;

import org.example.people.ENAM.Brand;
import org.example.people.ENAM.Color;

/**
 * Создать класс Car.
 * Поля:
 * - Марка машины(Энам)
 * - кол-во дверей
 * - спортивная или нет
 * - мощность в лс
 * - стоимость
 * - год выпуска
 * - цвет(энам)
 */
public class Car {
    private Brand brand;
    private int doors;
    private boolean isSport;
    private int power;
    private int yearOfManufacture;
    private Color color;
    private int price;

    public Car(Brand brand, int doors, boolean isSport, int power, int yearOfManufacture, Color color,int price) {
        this.price=price;
        this.brand = brand;
        this.doors = doors;
        this.isSport = isSport;
        this.power = power;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car: \n" +
                "brand= " + brand +
                ", \ndoors= " + doors +
                ", \nisSport= " + isSport +
                ", \npower= " + power +
                ", \nyearOfManufacture= " + yearOfManufacture +
                ", \ncolor= " + color;
    }
}

