package org.itstep;

import org.itstep.one_to_one_uni.Passport;
import org.itstep.one_to_one_uni.PassportRepository;
import org.itstep.one_to_one_uni.Person;
import org.itstep.one_to_one_uni.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    private PassportRepository passportRepository;

    @Autowired
    private PersonRepository personRepository;


    public static void main(String[] args) {

        SpringApplication.run
                (Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        passportRepository.findAll().stream().forEach(
                passport -> System.out.println(passport)
        );

        personRepository.findAll().stream().forEach(
                person -> System.out.println(person)
        );

        Person person = personRepository.findById(1L).orElse(null);
        personRepository.delete(person);

        passportRepository.findAll().stream().forEach(
                passport -> System.out.println(passport)
        );

        personRepository.findAll().stream().forEach(
                person1 -> System.out.println(person1)
        );

        Person per = new Person();
        Passport passport = new Passport();
        passport.setCountry("RU");
        per.setPassport(passport);
        personRepository.save(per);

        passportRepository.findAll().stream().forEach(
                pasport -> System.out.println(pasport)
        );

        personRepository.findAll().stream().forEach(
                person1 -> System.out.println(person1)
        );
    }
}
