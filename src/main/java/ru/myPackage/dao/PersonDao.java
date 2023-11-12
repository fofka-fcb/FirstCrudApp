package ru.myPackage.dao;

import org.springframework.stereotype.Component;
import ru.myPackage.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {

    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 23, "tom@gmail.com" ));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 54, "bob@gmail.com" ));
        people.add(new Person(++PEOPLE_COUNT, "Piter", 37, "piter@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setEmail(updatePerson.getEmail());
//        personToBeUpdated.setPhoneNumber(updatePerson.getPhoneNumber());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }

}
