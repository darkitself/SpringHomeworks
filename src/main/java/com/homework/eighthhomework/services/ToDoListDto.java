package com.homework.eighthhomework.services;

import com.homework.eighthhomework.entities.Event;
import com.homework.eighthhomework.entities.ToDoList;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToDoListDto {
    @NotBlank
    private String name;
    @NotEmpty
    private List<@NotBlank String> events = new LinkedList<>();

    public String getName() {
        return name;
    }

    public List<String> getEvents() {
        return events;
    }

    protected ToDoListDto() { }

    public ToDoListDto(ToDoList toDoList){
        name = toDoList.getName();
        events = toDoList.getEvents().stream()
                .map(Event::getName)
                .collect(Collectors.toList());
    }
}
