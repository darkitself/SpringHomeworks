package com.homework.eighthhomework.controller;

import com.homework.eighthhomework.services.ToDoListDto;
import com.homework.eighthhomework.services.ToDoListService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
public class Controller {
    private final ToDoListService toDoListService;

    public Controller(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @PostMapping("/save")
    public ResponseEntity<ToDoListDto> saveToDoList(@Valid @RequestBody ToDoListDto dto) {
        toDoListService.save(dto);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/get")
    public List<ToDoListDto> getAllLists(){
        return toDoListService.getAll();
    }
}
