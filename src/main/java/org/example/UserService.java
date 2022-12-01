package org.example;

public class UserService {

    private final FiscalCodeGenerator service;
    private final DAOUser dao;


    public UserService() {
        this(new FiscalCodeGenerator(), new DAOUser());
    }

    UserService(FiscalCodeGenerator service, DAOUser dao) {
        this.service = service;
        this.dao = dao;
    }

    public User addUser(String name, String surname) {
        String fiscalCode = service.generate(name, surname);
        User user = new User(name, surname, fiscalCode);
        dao.save(user);
        return user;
    }
}
