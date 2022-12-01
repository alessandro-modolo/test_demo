package org.example;

public class FiscalCodeGenerator {
    public String generate(String name, String surname) {
        System.out.println("FiscalCodeGenerator.generate");
        return surname.substring(0,3).toUpperCase() + name.substring(0,3).toUpperCase();
    }
}
