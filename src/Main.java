import model.Enums.*;
import model.entity.Person;
import repository.PersonRepository;
import service.Impl.PersonServiceImpl;
import service.PersonService;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        PersonService service = new PersonServiceImpl();

        person.setStatus(Status.ACTIVE);
//        person.setCreateDate(LocalDateTime.now());
//        person.setUpdatedDate(LocalDateTime.now());
        person.setEmail("antongrizman193@gmail.com");
        person.setFullName("Zhanadil uulu Abaz");
        person.setAge(19);
        person.setGender(Gender.MALE);
        person.setFamilyStatus(FamilyStatus.SINGLE);
        person.setCountry(Country.KYRGYZSTAN);
        person.setAbout("Java back end developer");
        person.setZodiac(Zodiac.TAURUS);

        service.save(person);
        System.out.println(person);
        service.removeById(1);
    }
}