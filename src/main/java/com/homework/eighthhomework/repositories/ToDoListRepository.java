package com.homework.eighthhomework.repositories;

import com.homework.eighthhomework.entities.ToDoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList, Long> {

}
