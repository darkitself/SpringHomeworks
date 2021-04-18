package com.homework.fourth_homework.Dto;

import java.time.LocalDate;

public class AnswerInfo extends Info{
    public Long id;

    public AnswerInfo(){}

    public AnswerInfo(LocalDate date, Long id) {
        super(date);
        this.id = id;
    }
}
