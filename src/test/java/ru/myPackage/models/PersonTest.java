package ru.myPackage.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс 'Person' должен: ")
public class PersonTest {

    Person person;

    @BeforeEach
    void prepareData() {
        person = new Person(1, "Roman", 15, "roman@gmail.com");
    }

    @Test
    @DisplayName("Корректно получать 'id'")
    public void shouldHaveCorrectGetId() {
        assertEquals(1, person.getId());
    }

    @Test
    @DisplayName("Корректно устанавливать 'id'")
    public void shouldHaveCorrectSetId() {
        person.setId(2);
        assertEquals(2, person.getId());
    }

    @Test
    @DisplayName("Корректно получать 'name'")
    public void shouldHaveCorrectGetName() {
        assertEquals("Roman", person.getName());
    }

    @Test
    @DisplayName("Корректно устанавливать 'name'")
    public void shouldHaveCorrectSetName() {
        person.setName("NotRoman");
        assertEquals("NotRoman", person.getName());
    }

    @Test
    @DisplayName("Корректно получать 'age'")
    public void shouldHaveCorrectGetAge() {
        assertEquals(15, person.getAge());
    }

    @Test
    @DisplayName("Корректно устанавливать 'age'")
    public void shouldHaveCorrectSetAge() {
        person.setAge(25);
        assertEquals(25, person.getAge());
    }

    @Test
    @DisplayName("Корректно получать 'email'")
    public void shouldHaveCorrectGetEmail() {
        assertEquals("roman@gmail.com", person.getEmail());
    }

    @Test
    @DisplayName("Корректно устанавливать 'email'")
    public void shouldHaveCorrectSetEmail() {
        person.setEmail("roman1234@gmail.com");
        assertEquals("roman1234@gmail.com", person.getEmail());
    }
}