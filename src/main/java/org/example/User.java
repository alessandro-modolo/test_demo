package org.example;

public class User {
    private final String name;
    private final String surname;
    private final String fiscalCode;

    public User(String name, String surname, String fiscalCode) {
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }
}
