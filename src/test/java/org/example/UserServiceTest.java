package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private FiscalCodeGenerator service;
    @Mock
    private DAOUser dao;

    @Test
    public void addUser_givenNameAndSurname_shouldReturnUserInstance() {
        // given.
        String name = "alessandro";
        String surname = "modolo";
        when(service.generate(name, surname)).thenReturn("test fc");
        UserService sut = new UserService(service, dao);
        // when
        User actual = sut.addUser(name, surname);
        // then
        assertThat(actual.getName()).isEqualTo(name);
        assertThat(actual.getSurname()).isEqualTo(surname);
        assertThat(actual.getFiscalCode()).isEqualTo("test fc");
        verify(service).generate(name, surname);

    }
}
