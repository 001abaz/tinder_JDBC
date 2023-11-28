package service.Impl;

import model.entity.Person;
import repository.Impl.PersonRepositoryImpl;
import repository.PersonRepository;
import service.PersonService;

import java.util.List;

public class PersonServiceImpl implements PersonService {
    private PersonRepository repository = new PersonRepositoryImpl();
    @Override
    public void save(Person person) {
        repository.save(person);
    }

    @Override
    public void removeById(int id) {

    }

    @Override
    public Person getById(int id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void update(Person person) {

    }
}
