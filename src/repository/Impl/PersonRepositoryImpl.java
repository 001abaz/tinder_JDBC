package repository.Impl;
import model.entity.Person;
import repository.DbHelper;
import repository.PersonRepository;
import service.PersonService;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    DbHelper dbHelper = new DbHelperImpl();


    @Override
    public void save(Person person) {
        System.out.println("no try");
        try  (PreparedStatement preparedStatement = dbHelper.getPreparedStatement
                ("INSERT INTO tb_person (status, email, fullName, age, gender, familyStatus, country, about, zodiac) VALUES (?,?,?,?,?,?,?,?,?)")){
            System.out.println("try");
            preparedStatement.setString(1, person.getStatus().toString());
//            preparedStatement.setDate(2, Date.valueOf(person.getCreateDate().toLocalDate()));
//            preparedStatement.setDate(3,Date.valueOf(person.getUpdatedDate().toLocalDate()));
            preparedStatement.setString(2, person.getEmail());
            preparedStatement.setString(3, person.getFullName());
            preparedStatement.setInt(4, person.getAge());
            preparedStatement.setString(5, person.getGender().toString());
            preparedStatement.setString(6, person.getFamilyStatus().toString());
            preparedStatement.setString(7, person.getCountry().toString());
            preparedStatement.setString(8, person.getAbout());
            preparedStatement.setString(9, person.getZodiac().toString());

            preparedStatement.executeUpdate();
            System.out.println("working");


        } catch (SQLException e) {
            System.out.println("catch");
        }
    }

    @Override
    public void removeById(int id) throws SQLException {
        PreparedStatement preparedStatement = dbHelper.getPreparedStatement("INSERT INTO tb_person (status, createDate, updatedDate, email, fullName, age, gender, familyStatus, country, about, zodiac) VALUES('Active', '2023-01-01', '2023-01-01', 'john.doe@example.com', 'John Doe', 30, 'Male', 'Married', 'United States', 'I am a software engineer.', 'Libra')");
        preparedStatement.executeUpdate();
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
//        List<Person> activePersons = new ArrayList<>();
//        for(Person person : db){
//            if(person.getStatus().equals(Status.ACTIVE)){
//                activePersons.add(person);
//            }
//        }
//        return activePersons;
        return null;
    }

    @Override
    public void update(Person person) {
    }
}
