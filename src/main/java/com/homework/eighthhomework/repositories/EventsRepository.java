package com.homework.eighthhomework.repositories;

import com.homework.eighthhomework.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventsRepository extends CrudRepository<Event, Long> {

}
