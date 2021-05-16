package com.homework.eighthhomework.entities;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "to_do_lists", uniqueConstraints = {
        @UniqueConstraint(name = "TO_DO_LIST_UC", columnNames = {"name"})})
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "listId", fetch = FetchType.LAZY)
    private final List<Event> events = new LinkedList<>();

    protected ToDoList() {

    }

    public ToDoList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Event> getEvents() {
        return events;
    }
}
