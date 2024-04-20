package org.example.people._class;


import org.example.people.enams.Brand;
import org.example.people.enams.Color;
import org.example.people.enams.Country;
import org.example.people.enams.Currency;

import java.util.Arrays;
import java.util.List;

public class List_Address_Car_Account {
    public static void main(String[] args) {
        Address address = new Address(Country.USA, "Wall Street", 1, 1);
        Address address1 = new Address(Country.USA, "Wall Street", 1, 2);
        Address address2 = new Address(Country.USA, "Wall Street", 1, 3);
        Address address3 = new Address(Country.USA, "Wall Street", 1, 4);
        Address address4 = new Address(Country.UK, "Backer Street", 2, 1);
        Address address5 = new Address(Country.UK, "Backer Street", 2, 2);
        Address address6 = new Address(Country.UK, "Backer Street", 2, 3);
        Address address7 = new Address(Country.UK, "Backer Street", 2, 4);
        Address address8 = new Address(Country.GERMANY, "BussenStr.", 3, 1);
        Address address9 = new Address(Country.GERMANY, "BussenStr.", 3, 2);
        Address address10 = new Address(Country.GERMANY, "BussenStr.", 3, 3);
        Address address11 = new Address(Country.GERMANY, "BussenStr.", 3, 4);
        Address address12 = new Address(Country.CANADA, "Wall Street", 4, 1);
        Address address13 = new Address(Country.FRANCE, "Wall Street", 4, 2);
        List<Address> addresses =Arrays.asList(address,address1,address2,address3,address4,address5,address6,address7,address8,address9,address10,address11,address12,address13);

        Car car = new Car(Brand.BMW, 2, true, 500, 2022, Color.BLACK,10000);
        Car car1 = new Car(Brand.BMW, 4, false, 200, 2020, Color.RED,20000);
        Car car2 = new Car(Brand.BMW, 4, true, 400, 2022, Color.RED,15000);
        Car car3 = new Car(Brand.MERCEDES, 4, true, 600, 2010, Color.BLACK,50000);
        Car car4 = new Car(Brand.MERCEDES, 4, true, 600, 1980, Color.WIETE,50000);
        Car car5 = new Car(Brand.LADA, 4, false, 100, 2022, Color.RED,1000);
        Car car6 = new Car(Brand.MAZDA, 2, true, 400, 2021, Color.WIETE,30000);
        Car car7 = new Car(Brand.TOYOTA, 4, false, 350, 2024, Color.BLU,10000);
       List<Car> cars = Arrays.asList(car,car1,car2,car3,car4,car5,car7);


        Account account=new Account(Currency.USD,25000.99,"ID12.12");
        Account account1=new Account(Currency.USD,500000.5,"ID16.61");
        Account account2=new Account(Currency.EURO,12000,"ID.Privet");
        Account account3=new Account(Currency.EURO,242500,"ID123456");
        Account account4=new Account(Currency.CAD,40500,"ID999");
        Account account5=new Account(Currency.GBR,650650,"ID12.12");
      List<Account>accounts=Arrays.asList(account,account1,account2,account3,account4,account5);

        System.out.println(Arrays.toString(new List[]{addresses}));
        System.out.println(cars);

    }
}
