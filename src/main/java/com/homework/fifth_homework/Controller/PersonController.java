package com.homework.fifth_homework.Controller;

import com.homework.fifth_homework.Person.Person;
import com.homework.fifth_homework.Person.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Validated
@RestController
public class PersonController {
    @PostMapping("/createPerson")
    public ResponseEntity<Person> getJson(@Valid @RequestBody Person person)
    {
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
