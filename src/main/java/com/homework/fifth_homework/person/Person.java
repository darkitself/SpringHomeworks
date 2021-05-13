package com.homework.fifth_homework.person;

import com.homework.fifth_homework.date_validator.DateIsValid;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class Person {
    @DateIsValid
    @NotNull(message = "Birthday required to fill in")
    LocalDate birthday;

    @NotBlank(message = "Name required to fill in")
    @Size(max = 150, message = "Max name length is 150")
    String name;

    @Size(max = 150, message = "Max sname length is 150")
    String sname;

    @NotNull(message = "Sex required to fill in")
    Sex sex;

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
