package service;

import model.entity.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);
    void removeById(int id);
    Person getById(int id);
    List<Person> getAll();
    void update(Person person);

}
