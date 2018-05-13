package com.vikas.springdatarest.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.vikas.springdatarest.eventmanagement.entities.Event;

public interface EventRepository extends CrudRepository<Event, Long> {

}
