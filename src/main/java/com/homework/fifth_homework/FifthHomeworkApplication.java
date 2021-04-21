package com.homework.fifth_homework;

import com.homework.fifth_homework.Person.Person;
import com.homework.fifth_homework.Person.Printer;
import com.homework.fifth_homework.Person.Sex;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

@SpringBootApplication
public class FifthHomeworkApplication implements CommandLineRunner {
    @Autowired
    Printer printer;

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(FifthHomeworkApplication.class);
        app.run(args);
    }

    @Override
    public void run(String... args) {
        Scanner in = new Scanner(System.in);
        Person p = new Person();
        while (true) {
            try {
                System.out.println("Birthday: ");
                p.setBirthday(LocalDate.parse(in.next()));
                System.out.println("Name: ");
                p.setName(in.next());
                System.out.println("Sname: ");
                p.setSname(in.next());
                System.out.println("Sex: ");
                p.setSex(Sex.valueOf(in.next()));
                printer.printPerson(p);
                break;
            } catch (ConstraintViolationException ex) {
                System.out.printf("%s %s%n", LocalDateTime.now(), ex.getMessage());
            }
        }
    }

}
