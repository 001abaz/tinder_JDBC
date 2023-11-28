package repository;

import model.entity.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonRepository {
    void save(Person person);
    void removeById(int id) throws SQLException;
    Person findById(int id);
    List<Person> getAll();
    void update(Person person);

}
