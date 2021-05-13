package com.homework.fifth_homework.person;

import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
@Component
public class Printer {
    public void printPerson(@Valid Person p)
    {
        System.out.println("Person created: ");
        System.out.println("Name: " + p.getName());
        System.out.println("Sname: " + p.getSname());
        System.out.println("Birthday: " + p.getBirthday());
        System.out.println("Sex: " + p.getSex());
    }
}
