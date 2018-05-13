package com.vikas.springdatarest.eventmanagement.repos;

import org.springframework.data.repository.CrudRepository;

import com.vikas.springdatarest.eventmanagement.entities.Venue;

public interface VenueRepository extends CrudRepository<Venue, Long> {

}
