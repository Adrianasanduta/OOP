package com.company;

import java.util.Date;

public class Person  {
    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    Phone phone;

    // Method to show person X who works in department Y
    public void works(Person p, Department d){
        System.out.println(p.givenName + "works in" + d.name);
    }

}