package com.homework.eighthhomework.services;

import com.homework.eighthhomework.entities.Event;
import com.homework.eighthhomework.entities.ToDoList;
import com.homework.eighthhomework.repositories.EventsRepository;
import com.homework.eighthhomework.repositories.ToDoListRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoListService {
    private final ToDoListRepository toDoListRepository;
    private final EventsRepository eventsRepository;

    public ToDoListService(ToDoListRepository toDoListRepository, EventsRepository eventsRepository) {
        this.toDoListRepository = toDoListRepository;
        this.eventsRepository = eventsRepository;
    }

    @Transactional
    public void save(ToDoListDto toDoListDto) {
        ToDoList toDoList = toDoListRepository.save(new ToDoList(toDoListDto.getName()));
        eventsRepository.saveAll(toDoListDto.getEvents().stream()
                .map(ev -> new Event(ev, toDoList))
                .collect(Collectors.toList()));
    }

    public List<ToDoListDto> getAll() {
        List<ToDoListDto> res = new LinkedList<>();
        toDoListRepository.findAll().forEach(tdl -> res.add(new ToDoListDto(tdl)));
        return res;
    }
}
