package pl.erbel.memory.memoryleak;

import java.util.Date;

public class User {

    String firstName;

    String lastName;

    Date birthDate;

    public User(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
}
