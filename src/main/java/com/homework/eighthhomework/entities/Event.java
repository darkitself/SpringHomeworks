package com.homework.eighthhomework.entities;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(name = "events", uniqueConstraints = {
        @UniqueConstraint(name = "EVENT_UC", columnNames = {"name", "list_id"})})
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "list_id")
    private ToDoList listId;

    protected Event() {
    }

    public Event(String name, ToDoList toDoList) {
        this.name = name;
        this.listId = toDoList;
    }

    public String getName() {
        return name;
    }
}
